定义:
通常又叫模板模式,是指定义一个算法的骨架,并允许子类为其中的一个或者多个步骤提供实现。

模板方法使得子类可以在不改变算法结构的情况下,重新定义算法的某些步骤.

适用场景：
1、一次性实现一个算法不变的部分,并将可变的行为留给子类来实现。
2、各子类中公共的行为被提取出来并集中到一个公共的父类中，从而避免代码重复。

2类角色：
 abstractClass(抽象类)：定义算法的骨架，可以是抽象也可以是具体的。
 concreteClass(具体子类):实现抽象类算法的具体一步，也可以覆盖在父类中已经实现的具体基本操作

源码应用：
  jdbcTemplate,httpServlet的doget/dopost,arraylist的get
优点：
1、利用模板方法将相同处理逻辑的代码放到抽象父类中,可以提高代码的复用性
2、将不同的代码不同的子类中，通过对子类的拓展增加的新的行为,提高代码的拓展性
3、把不变的行为写在父类上，去除子类的重复代码，提供了一个很好的代码复用平台，符合开闭原则

缺点：
1、类数目的增加,每一个抽象类都需要一个子类来实现，这样导致类的个数增加，间接增加系统实现的复杂度
2、继承关系自身缺点,如果父类添加新的抽象方法，所有子类都要改一遍

钩子方法：一个勾子方法由一个抽象类或具体类声明并实现,而其子类可能会加以拓展。
分两类：一类钩子方法与一些具体步骤“挂钩”，以实现在不同条件下执行模板方法中的不同步骤，这类钩子方法
    的返回类型通常是boolean类型，方法名一般为isXXX(),用于对某个条件进行判断,如果条件满足则执行
    某一步骤,否则将不执行。
    另一类就是抽象类中实现体为空的具体方法，子类可以根据需要覆盖或者继承这些钩子方法