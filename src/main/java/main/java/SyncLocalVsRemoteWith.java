package main.java;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
//import com.intellij.webcore.resourceRoots.actions.VcsActionGroupPublishGroup.UploadTo

public class SyncLocalVsRemoteWith extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        AnAction action = ActionManager.getInstance().getAction("PublishGroup.UploadTo");
        action.actionPerformed(e);
    }
}
