package MVC;

import java.awt.event.ActionListener;

public class AppModel{

    private int state;

    public AppModel(int initialState) {
        this.state = initialState;
    }

    public void update() {
        this.state++;
    }
}
