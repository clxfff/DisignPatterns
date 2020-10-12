package observerpattern;

/**
 * @author clx
 */
public class Main {
    public static void main(String[] args) {
        CriminalObservable criminal = new CriminalObservable();
        // 新建3个警察
        PoliceObserver police1 = new PoliceObserver("1");
        PoliceObserver police2 = new PoliceObserver("2");
        PoliceObserver police3 = new PoliceObserver("3");

        criminal.addObserver(police1);
        criminal.addObserver(police2);
        criminal.addObserver(police3);

        criminal.crime("盗窃");
    }
}
