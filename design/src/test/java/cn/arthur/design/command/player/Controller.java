package cn.arthur.design.command.player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arthur.
 */
public class Controller {
    private List<IAction> actions = new ArrayList<IAction>();

    public void addAction(IAction action){
        actions.add(action);
    }

    public void execute(IAction action){
        action.execute();
    }

    public void executes(){
        for (IAction action:actions) {
            action.execute();
        }
        actions.clear();
    }



}
