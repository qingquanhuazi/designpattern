package cn.arthur.design.observer.mouseevent.handler;


import cn.arthur.design.observer.mouseevent.core.Event;
import cn.arthur.design.observer.mouseevent.core.EventListener;

/**
 * 观察者
 * Created by Tom.
 */
public class MouseEventLisenter implements EventListener {

    public void onClick(Event e){
        System.out.println("==========触发鼠标单击事件========\n" + e);
    }

    public void onMove(Event e){

        System.out.println("==========触发鼠标移动事件========\n" + e);
    }
}
