
<p>
<a href="https://plugins.jetbrains.com/plugin/14091/"><img src="https://img.shields.io/jetbrains/plugin/r/rating/14091"/></a>
<a href="https://plugins.jetbrains.com/plugin/14091/"><img src="https://img.shields.io/jetbrains/plugin/v/14091?label=version"/></a>
<a href="/LICENSE"><img src="https://img.shields.io/github/license/vyach-vasiliev/intellij-deploy-for-commits"/></a>
</p>

<!-- Plugin description -->

# Deploy files directly from Commits of VCS!
### Plugin for JetBrains IDEs (Intellij IDEA, PyCharm, PHPStorm etc.)
Added VCS menu items to deploy files from selected commits.\
See the example in the screenshot.

[Official page](https://plugins.jetbrains.com/plugin/14091/) free plugin in JetBrains Marketplace


## How install
- open `IDE settings -> plugins` and type "Deploy for Commits" for search
- or download manually [from official store](https://plugins.jetbrains.com/plugin/14091/)

## How use
1. Select line/lines of commits
2. Open the right menu in the file panel on the right
3. Choose action for deployment

![alt text](https://raw.githubusercontent.com/vyach-vasiliev/intellij-deploy-for-commits/refs/heads/main/images/example-min.png "Example")

## Got an issue?
If the plugin crashes with a class loading error, make sure you have `boot Java runtime` of the IDE version `21` or higher installed ([see more](https://www.jetbrains.com/help/idea/switching-boot-jdk.html)).\
And if installing a compatible `boot Java runtime` version doesn't help you, feel free to open an issue [here](/../../issues).

<!-- Plugin description end -->

## How install
- open `IDE settings -> plugins` and type "Deploy for Commits" for search
- or [download manually](https://plugins.jetbrains.com/plugin/14091/)

## How build
```sh
build --stacktrace
```

Example build for specific version (2022.* for example)
```sh
build -PideaVersion=2022.1 -PsinceApp=221 -PuntilApp=231.* --stacktrace
```

And finally, if you want to remove of large files from the cache, then delete the folders along this path (for Windows OS)
`%USERPROFILE%/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/`

## Resources
- Official docs - https://plugins.jetbrains.com/docs/intellij/welcome.html
- List of actions - https://github.com/lisiur/idea-actions
- List of versions - https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
- Gradle build - https://github.com/JetBrains/gradle-intellij-plugin

## Contribution
**Please let me know about any problems in [issues](/../../issues). Cheers!**
