建造者模式:
   定义：是将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示。
   特征:用户只需指定需要建造的类型就可以获得对象,建造过程及细节不需要了解。
适用场景：
   1、适用于创建对象需要很多步骤,但是步骤的顺序不一定固定。
   2、如果一个对象有非常复杂的内部结构(很多属性)
   3、把复杂对象的创建和使用分离

优点:
  1、封装性好,创建和使用分离
  2、拓展性好，建造者类之间独立,一定程度上解耦

缺点:
 1、产生多余的Builder对象
 2、产品内部发生变化,建造者都要修改,成本较大

源码应用：
 1、StringBuilder的append方法
 2、SqlSessionFactoryBuilder的build最终都会变成SqlSessionFactory
 3、BeanDefinitionBuilder


建造者模式和工厂模式的区别：
 1、建造者更加注重方法的调用顺序,工厂模式注重于创建对象
 2、创建对象的力度不同,建造者模式创建复杂的对象，由各种复杂的部件组成,工厂模式创建出来都一样。
 3、关注点：工厂模式只需要把对象创建出来即可,而建造者模式中不仅要创建出这个对象,还要知道这个对象
 由哪些部件组成
 4、建造者模式根据建造过程中的顺序不一样,最终的对象部件组成也不一样。

总结：高配中配与低配，想怎么配就怎么配
目的：开放个性配置步骤
生活案例：选配
