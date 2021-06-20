
# Scabbard

<p align="center">
<img src="docs/images/scabbard-icon.png" 
width="210" hspace="10" vspace="10">
</p>

<p align="center">
<b>A tool to visualize and understand your Dagger 2 dependency graph.</b>
</p>

<p align="center"> 
<a href="https://github.com/arunkumar9t2/scabbard/releases/latest"><img src="https://img.shields.io/github/release/arunkumar9t2/scabbard.svg?style=flat-square&label=Release&logo=github&colorB=fb7b21"/></a>
<a href="https://bintray.com/arunkumar9t2/maven/scabbard-processor/_latestVersion"><img src="https://img.shields.io/bintray/v/arunkumar9t2/maven/scabbard-processor.svg?style=flat-square&label=Processor&logo=data%3Aimage%2Fpng%3Bbase64%2CiVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAA7EAAAOxAGVKw4bAAAEPUlEQVRo3u2YT2gcZRTAf28bcmhLKSEEC5vSg0KIksTbrK0RjzkUoQERJ5LJQcRDXYp4kZZQGuxJ7amm8TKrO4WKNtRQIVQtaOjk4KFKTuLBQ0%2BlBylLCNtlnof9Nvm6bjYzuzt1q%2FvgY%2F%2Fw5s%2Fve9%2F7Cz35n8lskHvWC3KDaT8nk%2BbNvSA3JvADsJI2TCZFS4wBK8BRwAFWZlOEyaQD4UzIDkRNHIGV2cBJBUZSOE4TwDJwbBeVdYWTBTd80LUWiQFRs8wNL3CGuhLEC5wx4IYFUQEeWiol6%2FtLIMtekBvqKhAvcLIgtk9UgAvA9zUdhSLw1eMwXPOC3P6uAVHkPvAjEBmIj8yqWGqbwBzwtQW7orDVNSAFNywD7wC%2BscQF3w0r9VHFd8NN4C1jmQ%2BASwU3jLrKR3w3LIO%2BDbpQD1GntwXqgl7yOwQB0NfJyOG761FMvcpTVaI8SemBJI5smu79%2B5pk6T6EEZC%2BPWIvqP7hz4SlprWQ7PqcQUSyMXZiE%2Fjdd8PEzn4Q5TbooRgV26vAnRY38w1UP46h9wvwSl1uih21%2Bs1K%2B3j3t3N6Wg2%2FZZOlbWknnG4Bf%2F3jNDR6N20JRHa7sgS4wIZ1%2F%2FttgFwFvrN%2BTwKfN3o3EUkOUsVoCDKg8BnISdCNgru%2BRyTYsyIoAaXZwEGQSdBPgf1J26fM3n3X9voWJAJBkGMCNwUZnbuai3t9sz7GQPANyJDRL4Pcsa9vFsKT5JGLpqKtlSFHgdVIGZ0r5lpvi4s5UAwEg5YfngG%2BjNvPJgGpAPPAggWTFViNhBEvSA7jFXOIcAJh2YKoAGd8N7ycpC9PlNlNtXreLCyYWwqjLUwMTpiucsCyxGngcsdKFEVBqWwvC0aVBZT5OphVL8i9kKC%2Fn2wAkVfVRSt7R9bzI20SPDJNAs5DhOcQjiAcAe5uN1IzYYSwYI7a9jEDbnrVeVZTxzYQy%2FUQwFJh5rEo%2BIX1%2FCl7Qzs6DpotOhkROQs6b23KnyCv%2BW74mxc414DXzf%2BfAO%2BbPFEHIXlUl%2FyZ9ZYbrX3tgPx6%2FZ6On8r%2BLCIZ4GWzMYeBqYlT2dsIk8DzRj00WdyCkDJIXquWaKtbbAukBjMxPfwTSAbkuPk8jMgUyAGQZ0weeATyHsjATp4gD7pUcNfbbnk7Nmn0glwf6Dngwxg1XFkhL8hSp%2Fr2fZ0CuXv9XvTi9PBanWUaZHcpg5wWkSu%2BG3as3eoYSA1mfDq7JkgGON4gKlaPk3DFfzPsaC%2FQURDjM9H49PCaVCFsmFqIXdyty%2BsKH2nsM5wDzpqyI%2B%2B74eJTN3wwQ7rzBiYPUWoQT0S8osNc0aEnPelJT9LNI6Z17Y%2BXatS6lcZIT0n1ATQCKq2MTA%2BB3gI9GG9PNNEYKLk%2BG6i4tDAyzYCMVIG6QkrNDNfKgO5f9IMWJo0Km6i8S%2FpD7LgUD3RnPvDflb8BKBVzKqLzQocAAAAASUVORK5CYII%3D&colorB=fb7b21"/></a>
<a href="https://plugins.gradle.org/plugin/scabbard.gradle"><img src="https://img.shields.io/maven-metadata/v/https/plugins.gradle.org/m2/scabbard/gradle/scabbard.gradle.gradle.plugin/maven-metadata.xml.svg?style=flat-square&label=Gradle&logo=gradle&colorB=fb7b21&logoColor=06A0CE"/></a>
<a href="https://plugins.jetbrains.com/plugin/13548-scabbard--dagger-2-visualizer"><img src="https://img.shields.io/jetbrains/plugin/v/13548-scabbard--dagger-2-visualizer?style=flat-square&label=IntelliJ&logo=intellij-idea&colorB=fb7b21&logoColor=18d68c"/></a>
</p>

<p align="center"> 
<img src="https://img.shields.io/github/workflow/status/arunkumar9t2/scabbard/Build%20Workflow?style=flat-square&logo=github">
<a href="https://arunkumar9t2.github.io/scabbard/"><img src="https://img.shields.io/badge/Website-%20-lightgrey.svg?color=f7a147&colorA=f7a147&style=flat-square&logo=github"/></a>
</p>


<p align="center">
<img src="https://github.com/arunkumar9t2/scabbard/blob/main/docs/images/scabbard-demo.gif?raw=true" width="90%">
</p>

<p align="center">
<img src="docs/images/dev.arunkumar.scabbard.coffee.CoffeeApp.CoffeeShop.svg">
</p>

More advanced [examples](https://arunkumar9t2.github.io/scabbard/examples/).

## Features

* **Visualize** entry points, dependency graph, dagger errors, component relationships and scopes in your [Dagger 2](https://github.com/google/dagger) setup.

* **Minimal setup** - Scabbard's Gradle plugin prepares your project for graph generation and provides ability to customize graph generation behavior.

* **IDE integration** - Easily view a `@Component` or a `@Subcomponnet` graph directly from source code via gutter icons (IntelliJ/Android Studio).

* **Supports** both Kotlin and Java.

* Supports **Dagger Hilt** and **Anvil**

## Getting Started

For samples, guide and usage instructions please visit the [project website](https://arunkumar9t2.github.io/scabbard/).

## License

    Copyright 2020 Arunkumar

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
