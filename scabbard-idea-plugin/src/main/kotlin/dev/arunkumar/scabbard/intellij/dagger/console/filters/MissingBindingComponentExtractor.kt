package dev.arunkumar.scabbard.intellij.dagger.console.filters

typealias DaggerComponent = String

interface MissingBindingComponentExtractor {
  fun extract(line: String, entireLength: Int): Set<DaggerComponent>
}

class DefaultMissingBindingComponentExtractor : MissingBindingComponentExtractor {
  companion object {
    private const val DAGGER_MISSING_BINDING = "[Dagger/MissingBinding]"
    private const val EXTENDS = "extends"
  }

  private var isDaggerLog = false

  override fun extract(line: String, entireLength: Int): Set<DaggerComponent> {
    if (line.contains(DAGGER_MISSING_BINDING)) {
      isDaggerLog = true
      return emptySet()
    }
    if (isDaggerLog) {
      // Parse the component simple name from dagger component error line
      if (line.contains("{")) {
        val classNameWithModifiers = when {
          line.contains(EXTENDS) -> line.split(EXTENDS).first()
          else -> line.split("{").first()
        }
        // parse class name from string such as "public abstract class AppComponent"
        classNameWithModifiers
          .split(" ")
          .map { it.trim() }
          .lastOrNull { it.isNotBlank() }
          ?.let { componentName ->
            isDaggerLog = false
            return setOf(componentName)
          }
      }
    }
    return emptySet()
  }
}
