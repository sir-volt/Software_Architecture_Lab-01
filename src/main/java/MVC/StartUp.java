package MVC;

import bbom.MyApp;

import javax.swing.*;

public class StartUp {

    static public void main(String[] args) throws Exception {
        AppView view = new AppView();
        AppModel model = new AppModel(0, view);
        AppController controller = new AppController(model, view);
        SwingUtilities.invokeAndWait(() -> {
            controller.setVisible(true);
        });
    }
}
