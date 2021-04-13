package dev.arunkumar.scabbard.plugin.processor.graphviz

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet
import dev.arunkumar.scabbard.plugin.processor.BindingGraphProcessor

@Module
interface GraphvizVisualizationModule {
  @Binds
  @IntoSet
  fun DefaultBindingGraphProcessor.bindingGraphProcessor(): BindingGraphProcessor

  @Binds
  @IntoSet
  fun ComponentTreeProcessor.componentTreeProcessor(): BindingGraphProcessor
}
