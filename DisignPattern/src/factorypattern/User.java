package factorypattern;

/**
 * @author clx
 */
public class User {
    private void eatFruit() {
        FruitFactory fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.create();

    }

}
