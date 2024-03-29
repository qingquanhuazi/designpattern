1、掌握享元模式和组合模式的应用场景
2、了解享元模式的内部状态和外部状态
3、掌握组合模式的透明写法和安全写法
4、享元模式和组合模式的优缺点

定义：享元模式又称为轻量级模式,是对象池的一种实现。类似于线程池,线程池可以避免不停的创建和销毁多个对象,
   消耗性能。提供了减少对象数量从而改善应用所需的对象结构的方式。

宗旨：共享细粒度对象,将多个对同一对象的访问集中起来。

4个角色：
Flyweight(抽象享元类):抽象享元类通常是一个接口或抽象类,在抽象享元类中声明了具体享元类公共的方法,
    这些方法可以向外界提供享元对象的内部数据(内部状态),同时也可以通过这些方法来设置外部数据(外部状态)
ConcreteFlyweight(具体享元类)：
    具体享元类实现了抽象享元类，其实例称为享元对象；在具体享元类中为内部状态提供了存储空间。通常可以
    结合单例模式来设计具体享元类,为每一个具体享元类提供唯一的享元对象。
UnsharedConcreteFlyweight(非共享具体享元类)：并不是所有的抽象享元类的子类都需要被共享,不能被共享的
    子类可设计为非共享具体享元类，当需要一个非共享具体享元类的对象时可以直接通过实例化创建
FlyweightFactory(享元工厂类):享元工厂类用于创建并管理享元对象,它针对抽象享元类编程,将各种类型的具体
   享元对象存储在一个享元池中,享元池一般设计为一个存储“键值对”的集合(也可以是其他类型的集合),可以结合
   工厂模式进行设计；当用户请求一个具体享元对象时，享元工厂提供一个存储在享元池中已创建的实例或者创建
   一个新的实例(如果不存在),返回新创建的实例并将其存储在享元池中

生活场景应用：
各类房源共享、全国社保联网

适用场景：
1、常常用于系统底层的开发,以便解决系统的性能问题
2、系统有大量相似对象、需要缓冲池的场景

内部状态：固有属性不变的
外部状态：随外界的改变而改变


优点：减少对象的创建.降低内存中对象的数量,降低系统的内存,提高效率
    减少内存之外的其他资源占用
缺点：关注内、外部状态、关注线程安全问题。使系统、程序的逻辑复杂化

目的：共享资源池

总结：优化资源配置、减少重复浪费

源码应用：String、Integer、ObjectPool
