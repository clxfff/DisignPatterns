package singletonpattern;

/**
 * @author clx
 */
public class SingletonPattern02 {
    private static class Instance {
        public static SingletonPattern02 instance = new SingletonPattern02();
    }

    private SingletonPattern02(){}

    public SingletonPattern02 getInstance() {
        return Instance.instance;
    }
}
