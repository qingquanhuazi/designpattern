package cn.arthur.design.observer.gper;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher arthur = new Teacher("arthur");
        Teacher jerry = new Teacher("Jerry");

        gper.addObserver(arthur);
        gper.addObserver(jerry);

        //用户行为
        Question question = new Question();
        question.setUserName("张三");
        question.setContent("观察者模式适用于哪些场景？");

        gper.publishQuestion(question);
    }
}
