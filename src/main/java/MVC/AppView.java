package MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppView extends JFrame implements Observer{

    JLabel label = new JLabel("Current State: " + 0);
    public AppView() {
    }

    @Override
    public void updateView(int state) {
        this.label.setText("Current State: " + state);
        super.update(this.getGraphics());
    }

    @Override
    public Object getView() {
        return this.label;
    }
}
