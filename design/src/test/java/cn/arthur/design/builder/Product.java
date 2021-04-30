package cn.arthur.design.builder;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 23:33
 */
@Data
public class Product {
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' + '}';
    }
}
