package cn.arthur.design.delegate.simple;

/**
 * Created by arthur.
 */
public class Boss {
    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
