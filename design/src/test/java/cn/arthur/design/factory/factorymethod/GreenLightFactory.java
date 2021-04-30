package cn.arthur.design.factory.factorymethod;

import lombok.experimental.Accessors;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/10 0010 11:00
 */
@Accessors(chain = true)
public class GreenLightFactory implements LightFactory{
    @Override
    public Light createLight() {
        return new GreenLight();
    }
}
