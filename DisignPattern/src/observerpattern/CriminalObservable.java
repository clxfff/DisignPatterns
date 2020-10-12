package observerpattern;

import java.util.Observable;

/**
 * @author clx
 */
public class CriminalObservable extends Observable {


    public void crime(String event) {

        // change参数决定是否可以通知
        setChanged();
        System.out.println("罪犯正在" + event);

        // 逆序通知观察者
        notifyObservers();
    }

}
