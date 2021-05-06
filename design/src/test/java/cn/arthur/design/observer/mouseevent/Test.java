package cn.arthur.design.observer.mouseevent;


import cn.arthur.design.observer.mouseevent.handler.Mouse;
import cn.arthur.design.observer.mouseevent.handler.MouseEventLisenter;
import cn.arthur.design.observer.mouseevent.handler.MouseEventType;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        MouseEventLisenter lisenter = new MouseEventLisenter();

        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_CLICK,lisenter);
        mouse.addLisenter(MouseEventType.ON_MOVE,lisenter);

        mouse.click();
        mouse.move();
    }
}
