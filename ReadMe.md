# Plugin for IDE "JetBrains IDEA"
Added VCS menu items for deploying files of selected commits.

## How use
1. Select line/lines of commits
2. Open the right menu in the file panel on the right
3. Choose action for deployment

![alt text](images/example.png "Example")

## How build
Example build for 2022.* version
```sh
build -PideaVersion=2022.1 -PsinceApp=221 -PuntilApp=231.* --stacktrace
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