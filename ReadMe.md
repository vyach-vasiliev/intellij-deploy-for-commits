

# Plugin for JetBrains IDEs (IDEA, PyCharm, WebStorm, etc)
Added VCS menu items for deploying files of selected commits.

<img src="https://img.shields.io/jetbrains/plugin/r/rating/14091"/> [Official page](https://plugins.jetbrains.com/plugin/14091/) free plugin in JetBrains Marketplace

## How install
- open `IDE settings -> plugins` and type "Deploy for Commits" for search
- or [download manually](https://plugins.jetbrains.com/plugin/14091/)

## How use
1. Select line/lines of commits
2. Open the right menu in the file panel on the right
3. Choose action for deployment

![alt text](images/example.png "Example")

## How build
```
gradle build --stacktrace -PideaVersion=2021.1 -PsinceApp=211 -PuntilApp=221.*
```

And finally, if you want to remove of large files from the cache, then delete the folders along this path (for Windows)
`%USERPROFILE%/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/`

## Resources
- Official docs - https://plugins.jetbrains.com/docs/intellij/welcome.html
- List of actions - https://github.com/lisiur/idea-actions
- List of versions - https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
- Gradle build - https://github.com/JetBrains/gradle-intellij-plugin

## Contribution
**Please let me know about any problems in issues. Cheers!**
