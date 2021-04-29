package cn.arthur.design.simplefactory;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/10 0010 11:00
 */
public class RedLightFactory implements LightFactory{
    @Override
    public Light createLight() {
        return new RedLight();
    }
}
