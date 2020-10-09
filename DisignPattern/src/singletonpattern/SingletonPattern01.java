package singletonpattern;

/**
 * @author clx
 */
public class SingletonPattern01 {
    private static volatile SingletonPattern01 instance;
    private SingletonPattern01() {}

    public static SingletonPattern01 getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern01.class) {
                if (instance == null) {
                    instance = new SingletonPattern01();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

    }
}
