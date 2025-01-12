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

package dev.arunkumar.scabbard.gradle.util

import dev.arunkumar.scabbard.gradle.ScabbardPluginExtension
import kotlin.properties.Delegates.observable

/**
 * Property delegate that notifies
 * [ScabbardPluginExtension.onEnabledStatusChange] whenever the
 * extension is set. The broadcast happens even if value itself did not
 * change.
 */
internal fun ScabbardPluginExtension.enabledProperty() =
  observable(false) { _, _, newValue ->
    onEnabledStatusChange.execute(newValue)
  }
