查看类结构图ctrl+alt+shift+u
1、开闭原则Open-Closed：(OCP)
定义：一个软件如实体类、模块、函数应该对拓展开放，对修改关闭。 用抽象构建框架，用实现拓展细节。
优点：提高软件系统的可复用性及可维护性
总结：对拓展开放，对修改关闭
举例：智能家居中的可插拔配件
目的：减少维护带来的风险

2、依赖倒置原则Dependence Inversion(DIP)
定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象；
        抽象不应该依赖细节，细节应该依赖抽象；
        针对接口编程，不要针对实现编程
优点：可以减少类间的耦合性、提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险
总结：高层不应该依赖低层，要面向接口编程
举例：国家标准、行业标准
目的：更利于代码结构的升级 拓展

3、单一职责原则Simple-Responsibility(SRP)
定义：不要存在多于一个导致类变更的原因 ,一个类、接口、方法只负责一项职责
优点：降低类的复杂度，提高类的可读性，提高系统的可维护性，降低变更引起的风险
总结：一个类只干一件事，实现类要单一
举例：专业的人做专业的事
目的：便于理解，提高代码可读性

4、接口隔离原则Interface-Segregation(ISP)
定义：用多个专门的接口，而不是用单一的总接口，客户端不应该依赖它不需要的接口
    注意：一个类对应一个类的依赖应该建立在最小的接口上；
    建立单一接口，不要建立庞大臃肿的解耦；
    尽量细化接口，接口中的方法尽量少
    注意适度原则，一定要适度
优点：符合我们常说的高内聚、低耦合的设计思想，从而使得类具有很好的可读性，可拓展性和可维护性
总结：一个接口只干一件事，接口要精简单一
举例：专业的人做专业的事
目的：功能解耦，高聚合，低耦合

5、迪米特法则Law Of Demeter(LOD)
定义：一个对象应该对其他对象保存最少的了解。又叫最少知道原则，尽量降低类与类之间的耦合
 
优点：降低类之间的耦合
总结： 
    不该知道的不要知道，一个类应该保持对其它对象最少的了解，降低耦合度
    强调只和朋友交流，不和陌生人说话
    朋友：出现在成员变量、方法的输入、输出参数中的类成为成员朋友类，而出现在方法体内部的类不属于朋友类
举例：黄牛购票、房产中介
目的：只和朋友交流，不要和陌生人说话，减少代码臃肿

6、里氏替换原则Liskov Substitution(LSP)
定义： 如果对每一个类型为T1的对象o1，都有类型为T2的对象o2,使得以T1定义的所有程序P在所有的对象o1都替换成o2时，
      程序P的行为没有发生变化，那么类型T2是类型T1的子类型
优点：
    约束继承泛滥，开闭原则的一种体现。
    加强程序的健壮性，同时变更时也可以做到非常好的兼容性，提高程序的维护性，拓展性。降低需求变更时引入的风险。
总结：不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义
举例：子承父业
目的：防止继承泛滥

7、合成复用原则Composite&Aggregate Reuse(CARP)
定义：尽量使用对象组合、聚合、而不是继承关系达到软件复用的目的
     聚合has-a和组合(强聚合)contains-a
优点：可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响相对较少
总结：尽量使用组合或者聚合关系实现代码复用，少使用继承
举例：电脑的集成主板与非集成主板的区别
目的：降低代码耦合
