package MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppController extends JFrame implements ActionListener {

    private AppModel model;
    private AppView view;

    public AppController(AppModel model, AppView view) {
        super("My BBoM App");
        this.model = model;
        this.view = view;

        setSize(300, 70);
        setResizable(false);

        JButton button = new JButton("Update");
        button.addActionListener(this);

        JLabel label = (JLabel) this.view.getView();

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        setLayout(new BorderLayout());
        add(panel,BorderLayout.NORTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(-1);
            }
        });
    }

    public void actionPerformed(ActionEvent ev) {
        this.model.updateModel();
    }

}

