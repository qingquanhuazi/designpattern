定义：
是对命令的封装,每一个命令都是一个操作：请求的一方发出请求要求执行一个操作；接收的一方收到请求，
并执行操作。命令模式解耦了请求方和接收方,请求方只需请求执行命令，不用关心命令是怎样被接收，怎样被操作
以及是否被执行。。等


本质：解耦命令请求与处理

4个角色：
1、command(抽象命令类)：抽象命令类一般是一个抽象类或接口，在其中声明了用于执行请求的execute等方法,
通过这些方法可以调用请求接收者的相关操作
2、concreteCommand(具体命令类)：具体命令类是抽象命令类的子类,实现了在抽象命令类中声明的方法，
它对应具体的接收者对象，将接收者对象的动作绑定其中。具体命令类在实现execute方法时将调用接收者对象
的相关操作
3、invoker(调用者)：调用者即请求发送者，它通过命令对象来执行请求。一个调用者并不需要在设计时确定其
接收者，因此它只与抽象命令类之间存在关联关系。在程序运行时可以将一个具体命令对象注入其中，在调用具体
命令对象的execute方法，从而实现间接调用请求接收者的相关操作
4、receiver(接收者)：接收者执行与请求相关的操作，具体实现对请求的业务处理

生活场景：
遥控器、餐厅点菜单


适用场景：
1、现实语义中具备"命令"的操作
2、请求调用者和请求的接收者需要解耦,使得调用者和接收者不直接交互
3、需要抽象出等待执行的行为，比如撤销(undo)操作和恢复(redo)等操作
4、需要支持命令宏(即命令组合操作)

源码应用：
jdk中的runnable，实现run方法就会调用命令去启动线程抢占cpu资源


优点：
1、通过引入中间件(抽象接口)，解耦了命令请求与实现
2、拓展性良好，可以很容易地增加新的命令
3、支持组合命令，支持命令队列
4、可以在现有命令基础上，增加额外功能（比如日志记录。。。,结合装饰器模式更好）

缺点：
1、具体命令类可能过多
2、增加了程序的复杂度，理解更困难

总结：运筹帷幄之中，决胜千里之外
目的：解耦请求和处理
生活案例：遥控器

