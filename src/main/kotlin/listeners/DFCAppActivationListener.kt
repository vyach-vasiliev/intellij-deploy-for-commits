package listeners

import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.Anchor
import com.intellij.openapi.actionSystem.Constraints
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.application.ApplicationActivationListener
import com.intellij.openapi.wm.IdeFrame

internal class DFCAppActivationListener : ApplicationActivationListener {

    override fun applicationActivated(ideFrame: IdeFrame) {

        val actionManager = ActionManager.getInstance()

        val groupIdRepositoryChangesBrowserMenu = "Vcs.RepositoryChangesBrowserMenu"
        val groupRepositoryChangesBrowserMenu = actionManager.getAction(groupIdRepositoryChangesBrowserMenu) as DefaultActionGroup

        val actionIdUploadTo = "PublishGroup.UploadTo"
        val actionUploadTo = actionManager.getAction(actionIdUploadTo)
        if (!groupRepositoryChangesBrowserMenu.containsAction(actionUploadTo))
            groupRepositoryChangesBrowserMenu.add(actionUploadTo)


        val actionIdSyncWithDeployTo = "PublishGroup.SyncLocalVsRemoteWith"
        val actionSyncWithDeployTo = actionManager.getAction(actionIdSyncWithDeployTo)
        if (!groupRepositoryChangesBrowserMenu.containsAction(actionSyncWithDeployTo))
            groupRepositoryChangesBrowserMenu.add(actionSyncWithDeployTo, Constraints(Anchor.AFTER, actionIdUploadTo))
    }
}