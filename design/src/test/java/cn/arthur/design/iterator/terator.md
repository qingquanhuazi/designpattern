目标：
1、了解迭代器模式和命令的应用场景
2、自己手写迭代器
3、掌握迭代器模式和命令模式在源码中的应用，知其所以然

定义：
迭代器模式又称为游标模式，它提供一种顺序访问集合容器对象元素的方法，而又无须暴露集合内部表示

本质：抽离集合对象迭代行为到迭代器中，提供一致访问接口

生活场景中的应用：
寄件迭代分发、刷脸检票进站

适用场景：
1、访问一个集合对象的内容而无须暴露它的内部表示
2、为遍历不同的集合结构提供一个统一的访问接口

4个角色：
1、iterator(抽象迭代器)：它定义了访问和遍历元素的接口，声明了用于遍历数据元素的方法，例如
用于获取第一个元素的first()方法,用于访问下一个元素的next()方法，用于判断是否还有下一个元素的
hasNext()方法、用于获取当前元素的currentItem()方法等，在具体迭代器中将实现这些方法
2、concreteIterator(具体迭代器):它实现了抽象迭代器接口,完成对聚合对象的遍历，同时在具体迭代
器中通过游标来记录在聚合对象中所处的当前位置,在具体实现时游标通常是一个表示位置的非负整数
3、aggregate(抽象聚合类):它用于存储和管理元素对象，声明一个createIterator()方法用于创建一个
迭代器对象,充当抽象迭代器工厂角色
4、concreteAggregate(具体聚合类)：它是抽象聚合类的子类，实现了在抽象聚合类中声明的createIterator方法
，该方法返回一个与该具体聚合类对应的具体迭代器concreteIterator实例

源码应用：jdk的Iterator,hashMap的KeySet，EntrySet，values里有Iterator


alt+7查看类中所有方法


优点：
1、多态迭代：为不同的聚合结构提供一致的遍历接口，即一个迭代接口可以访问不同的聚合对象。
2、简化集合对象接口：迭代器模式将集合对象本身应该提供的元素迭代接口抽取到了迭代器中，使集合对象无须
 关心具体迭代行为
3、元素迭代功能多样化：每个集合对象都可以提供一个或多个不同的迭代器，使得同样元素聚合结构可以有不同的
迭代行为
4、解耦迭代与集合：迭代器模式封装了具体的迭代算法，迭代算法的变化，不会影响到集合对象的架构

缺点：
1、对于比较简单的遍历(数组或有序列表)，使用迭代器方式较为繁琐




E： element  规定集合元素的类型
T： type 规定该类的操作的类的具体类型
K： key  规定key的类型
V:  value  规定value的类型
?:  任意类型  啥都行,相当于没写,都是object


总结：流水线上扫一天，每个包裹扫一遍
目的：统一对集合的访问方式
生活案例：统一刷脸进站
源码：Iterator
