package observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author clx
 */
public class PoliceObserver implements Observer {

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("警察"+name+"观察到了小偷");
    }

    public PoliceObserver(String name) {
        this.name = name;
    }
}
