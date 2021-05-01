定义：
又称为桥梁模式、接口模式或柄体模式,是将抽象部分与它的具体实现部分分离,使它们都可以独立变化

通过组合的方式建立两个类之间的联系，而不是继承

适用场景：
1、在抽象和具体实现之间需要增加更多的灵活性的场景
2、一个类存在两个(或多个)独立变化的维度,而这两个(或多个)维度都需要独立进行拓展
3、不希望使用继承,或因为多层继承导致系统类的个数急剧增加


4个角色：
1、abstract（抽象类）：
2、refinedAbstraction(扩充抽象类)：
3、implementor(实现类接口)：
4、concreteImplementor(具体实现类)

优点：
1、分离抽象部分及其具体实现部分
2、提高了系统的拓展性
3、符合开闭原则
4、符合合成复用原则

缺点：
1、增加了系统的理解与设计难度
2、需要正确地识别系统中两个独立变化的维度

源码应用：
JDBC的driverManager