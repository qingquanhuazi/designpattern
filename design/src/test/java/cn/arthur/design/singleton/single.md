目标： 1、应用场景 2、idea多线程调试 3、保证线程安全的单例模式策略 4、反射暴力攻击单例解决方案及原理分析 5、序列化破坏单例的原理及解决方案 6、常见单例模式的写法 单例模式
定义：确保任何一个类在任何情况下都只有一个实例,并提供一个全局访问点

隐藏其所有的构造方法(只有一个实例)

源码：ServletContext、ServletConfig、ApplicationContext、DBPool、
    AbstractFactoryBean的getObject方法，
    mybatis的ErrorContext的LOCAL容器就是用ThreadLocal来做线程隔离
    spring的AbstractBeanFactory的getBean方法调用中用到的getSingleton，使用双重检查锁和ConcurrentHashMap保证了实例唯一和线程安全
单例模式的常见写法:
1、饿汉式单例：在类首次加载时即创建实例 
2、懒汉式单例：被外部类调用时才创建实例 
3、注册式单例：将每一个实例都缓存到统一的容器里,使用唯一标识获取实例 
4、ThreadLocal单例：保证同一线程内部的全局唯一,且天生线程安全

优点：1、在内存中只有一个实例，减少内存开销
     2、可以避免对资源的多重占用
     3、设置全局访问点,严格控制访问
缺点: 没有接口,拓展困难
      如果要拓展单例对象,只有修改代码,没有其他途径
重点总结：
  1、私有化构造器
  2、保证线程安全
  3、延迟加载
  4、防止序列化和反序列化破坏单例
  5、防御反射攻击单例
