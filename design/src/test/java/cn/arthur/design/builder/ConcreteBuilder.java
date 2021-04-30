package cn.arthur.design.builder;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 23:32
 */
public class ConcreteBuilder implements IBuilder {
    private Product product = new Product();

    @Override
    public Product build() {
        return product;
    }
}
