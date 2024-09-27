package MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppController {

    private AppModel model;
    private AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void updateModel() {
        this.model.update();
        /* THIS IS THE OUTPUT */
        log("State value: " + state);
    }

    private void log(String msg) {
        System.out.println("[Output] " + msg);
    }
}

