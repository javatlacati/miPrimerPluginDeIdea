import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.ui.awt.RelativePoint;

/**
 * Created by Javatlacati on 10/04/2017.
 */
public class HelloPlugin extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
//        StatusBar statusBar = WindowManager.getInstance()
//                .getStatusBar(anActionEvent.getProject());
        StatusBar statusBar = WindowManager.getInstance()
                .getStatusBar(DataKeys.PROJECT.getData(anActionEvent.getProject().getDataContext()));
        JBPopupFactory.getInstance()
                .createHtmlTextBalloonBuilder("Hola Mundo!", MessageType.INFO, null)
                .setFadeoutTime(7500)
                .createBalloon()
                .show(RelativePoint.getCenterOf(statusBar.getComponent()),
                        Balloon.Position.atRight);
    }
}
