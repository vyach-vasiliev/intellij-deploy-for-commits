package main.java;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;


public class SyncWithDeployTo extends AnAction {
    /**
     * Register "Sync with Deployed to" action
     * @param e Carries information on the invocation place
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        AnAction action = ActionManager.getInstance().getAction("PublishGroup.SyncLocalVsRemoteWith");
        action.actionPerformed(e);
    }
}
