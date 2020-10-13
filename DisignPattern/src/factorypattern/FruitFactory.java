package factorypattern;

/**
 * @author clx
 */
public interface FruitFactory {
    /**
     * 创建水果实体类
     * @return 具体水果
     */
    Fruit create();
}
