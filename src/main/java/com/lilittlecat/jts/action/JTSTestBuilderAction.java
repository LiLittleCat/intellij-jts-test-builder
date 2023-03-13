package com.lilittlecat.jts.action;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAwareAction;
import org.jetbrains.annotations.NotNull;
import org.locationtech.jtstest.testbuilder.JTSTestBuilder;
import org.locationtech.jtstest.testbuilder.JTSTestBuilderFrame;

/**
 * @author Yi.Liu
 * @link <a href="https://github.com/LiLittleCat">https://github.com/LiLittleCat</a>
 * @since 2022/12/15
 */

public class JTSTestBuilderAction extends DumbAwareAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        if (JTSTestBuilder.app == null) {
            JTSTestBuilder.app = new JTSTestBuilder();
            JTSTestBuilder.app.initFrame();
        } else {
            JTSTestBuilderFrame.instance().setVisible(true);
        }
    }
}
