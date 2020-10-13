package factorypattern;

/**
 * @author clx
 */
public class AppleFactory implements FruitFactory {
    /**
     * 创建水果实体类
     * @return 具体水果
     */
    @Override
    public Fruit create() {
        double price = 0;
        return new Apple("apple", "water", price);
    }
}
