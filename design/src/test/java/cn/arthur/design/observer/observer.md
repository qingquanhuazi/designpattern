定义:
观察者模式又叫发布-订阅模式，模型-视图模式、源-监听器模式或从属者模式。定义一种一对多的依赖关系,一个
主题对象可被多个观察者对象同时监听,使得每当主题对象状态变化时,所有依赖于它的对象都会得到通知并被自动更新

生活中的应用:
1、app角标通知
2、起床闹钟设置

观察者模式的适用场景:
1、当一个抽象模型包含两个方面内容,其中一个方面依赖于另一个方面
2、其他一个或多个对象的变化依赖于另一个对象的变化
3、实现类似广播机制的功能,无需知道具体收听者,只需分发广播,系统中感兴趣的对象会自动接收该广播
4、多层级嵌套使用,形成一种链式触发机制,使得事件具备跨域(跨越两种观察者类型)通知。

4个角色：
1、subject(目标)：目标又称为主题,它是指被观察的对象。在目标中定义了一个观察者结合,一个观察者目标可以
接受任意数量的观察者来观察,它提供一系列方法来增加和删除观察者对象，同时它定义了通知方法notify()。目标
类可以是接口,也可以是抽象类或具体类。
2、concreteSubject(具体目标):具体目标是目标类的子类，由它向观察者发出通知，由它实现在目标类中定义
的抽象业务逻辑方法(如果有),如果无须拓展目标类，则具体目标类可以省略
3、observer(观察者):观察者将对观察目标的改变做出反应，观察者一般定义为接口，该接口声明了更新数据的方法，
update()，因此又称为抽象观察者
4、concreteObserver(具体观察者):
在具体观察者中维护一个指向具体目标对象的引用,它存储具体观察者的有关状态,这些状态需要和具体目标的状态
保持一致,它实现了在抽象观察者observer中定义的update()方法，通常在实现时可以调用具体目标类的attach
方法将自己添加到目标类的集合中或通过detach方法将自己从目标类的集合中删除

优点：
1、观察者模式和被观察者是松耦合(抽象耦合)的，符合依赖倒置原则
2、分离了表示层(观察者)和数据逻辑层(被观察者)，并且建立了一套触发机制，使得数据的变化可以响应到多个表示层上
3、实现了一对多的通讯机制,支持事件注册机制，支持兴趣分发机制，当被观察者触发事件时，只有感兴趣的观察者可以
接收到通知
缺点：
1、如果观察者数量过多，则事件通知耗时较长
2、事件通知呈线性关系，如果其中一个观察者处理事件卡壳，会影响后续的观察者接收该事件
3、如果观察者和被观察者之间存在循环依赖，则可能造成两者之间循环调用，导致系统崩溃

源码应用：
基本listener结尾的都是观察者，如jdk的ServletContextListener，spring的ContextLoaderListener