目标：
1、总结设计原则和GOF23种设计模式，做整体认知
2、为深入学习源码分析做铺垫
3、了解设计模式之间的关联，解决设计模式混淆的问题

做好长期项目实践准备，掌握设计模式的道，而非术，遇到问题联系设计模式，不用本末倒置

GOF设计模式分以下三大类
创建型：
  工厂方法模式、抽象工厂模式、建造者模式、单例模式、原型模式
结构型：
  适配器模式、装饰器模式、代理模式、门面模式、组合模式、享元模式、桥接模式
行为型：
  策略模式、观察者模式、责任链模式、解释器模式、模板方法模式、迭代器模式、中介者模式、命令模式、访问者模式、备忘录模式、状态模式

一、容易混淆的模式：
  1、代理VS中介者
      代理：职责增强，不仅要建联系，还要参与过程
      中介：只负责牵线搭桥,建立联系
  2、委派模式VS静态代理模式
   委派：全权的静态代理，不做任何的增强
   代理：一定会有增强
   没有任何功能的增强就是委派
 3、 命令VS策略
  命令：解耦请求和处理，会有一个回调，会有反馈和处理结果，本来请求和处理是可以写在一块的
  策略：固定好的选项，一定是同样的结果，一定要用户有参与
 4、代理模式VS装饰器模式
  代理：组合实现功能增强和拓展
  装饰器：继承实现增强和拓展
 5、委派模式VS责任链模式
  委派：没有流程的概念，只需要拿到结果
  责任链：处理流程，处理流程可拓展，可定制，最终结果由责任链中的某些handler来决定
 6、代理VS中介
   代理：参与整个过程的，要跟进
   中介：有开头，没有结尾，不参与过程
 7、工厂方法VS抽象工厂
  工厂方法：产品拓展，单向维度
  抽象工厂：产品等级结构和产品族的相互拓展关系，多维度，至少是二维
 8、桥接模式VS适配器模式
  桥接：不用继承建立联系
  适配器：类适配器用的继承、对象适配器用的是组合、接口适配器实际上也是继承
 9、行为型VS结构型
  行为：对java中方法的使用提出的建议
  结构：对java类的组合提出建议
  创建： 对创建java对象的形式提出的建议
 10、抽象工厂VS模板方法
 抽象工厂：形式上可能会出现抽象方法，但是并不能体现流程
 模板方法：也是有可能会出现抽象方法，但是一定某个流程中的一个步骤
 严格来说：没有可比性
 11、建造者模式VS装饰器模式
 建造者：强调对象创建步骤的个性化，一般来说会有标配
 装饰器：更加强调拓展性，大桶套小桶
 12、适配器模式VS中介者模式
 适配器：解决兼容问题，可以用继承，也可以用组合
 中介者：一定是用组合，所有人可能都持有中介者引用
 13、桥接模式VS中介者模式
 共同点:不用继承，一定是用组合
 桥接：两个维度建立连接
 中介者：多维度建立连接(是一个更复杂的桥接模式的实现)
 14、桥接模式VS组合模式
 桥接：两个继承体系建立连接，反而就是为了满足个性的
 组合：目的不是为了连接，而是为了统一行动，统一一套API
 15、门面模式VS装饰器模式
 门面：打开一扇窗，通向全世界，统一入口，背后很多个子系统，承担一定的静态代理作用
 装饰器：为了拓展,一定是同宗同源的
 16、工厂模式VS策略模式
一般来说，它们俩会组合使用，策略将由工厂来创建
 17、享元模式VS饿汉式单例模式
  我们可以把对象池的容器设置成单例，同时，把对象池所在类设置为单例的工厂
 18、桥接模式VS命令模式
  桥接：需要一个中间的类，一定有功能实现的
  命令：需要一个抽象的中间类，只是为了规范
 19、委派模式VS门面模式
  在门面里面，可能会用到委派模式实现任务分发
 20、适配器模式VS策略模式
  适配器：兼容
  策略模式：把选择权交给用户
  没有可比性
 21、策略模式VS模板模式
   有时会混用，模板模式中可能设计的钩子方法，就是某一个策略的实现

