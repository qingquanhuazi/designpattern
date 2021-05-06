package cn.arthur.design.delegate.simple;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("海报图",new Leader());
        new Boss().command("爬虫",new Leader());
        new Boss().command("卖手机",new Leader());
    }
}
