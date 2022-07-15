/*
 * Copyright 2022 Arunkumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.arunkumar.scabbard.sample.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.DefineComponent
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@DefineComponent(parent = SingletonComponent::class)
interface HiltCustomComponent {
  @DefineComponent.Builder
  interface Builder {
    fun build(): HiltCustomComponent
  }
}

private const val NUMBER = "number"

@Module
@InstallIn(HiltCustomComponent::class)
object HiltCustomModule {
  @Provides
  @Named(NUMBER)
  fun providesNumber(): Int = 10
}

@Singleton
class SingletonBinding @Inject constructor()

class CustomBinding @Inject constructor(@param:Named(NUMBER) private val number: Int)

/** Entry point for exposing `HiltCustomComponent`'s bindings */
@EntryPoint
@InstallIn(HiltCustomComponent::class)
interface HiltCustomEntryPoint {
  fun customBinding(): CustomBinding
}
