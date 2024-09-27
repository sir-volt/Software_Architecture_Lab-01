package MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppView extends JFrame  implements ActionListener {

    private AppController controller;

    public AppView(AppController controller) {
        super("My BBoM App");

        this.controller = controller;

        setSize(300, 70);
        setResizable(false);

        JButton button = new JButton("Update");
        button.addActionListener(this);

        //JLabel label = new JLabel();

        JPanel panel = new JPanel();
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
        this.controller.updateModel();
    }
}
