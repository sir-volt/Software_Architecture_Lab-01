package MVC;

import java.awt.event.ActionListener;

public class AppModel implements Observable{

    private int state;
    private Observer view;

    public AppModel(int initialState, AppView view) {
        this.state = initialState;
        this.view = view;
    }

    @Override
    public void updateModel() {
        this.state++;
        this.view.updateView(this.state);
    }

    @Override
    public int getData() {
        return this.state;
    }
}
