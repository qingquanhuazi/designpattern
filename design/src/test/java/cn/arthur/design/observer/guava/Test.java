package cn.arthur.design.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by arthur.
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();


        PojoEvent guavaEvent = new PojoEvent();
        VoEvent voEvent = new VoEvent();
        eventBus.register(guavaEvent);
        eventBus.register(voEvent);

        eventBus.post(new Pojo("arthur"));
    }
}
