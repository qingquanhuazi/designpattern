package cn.arthur.design.factory.abstrctFactory;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 12:58
 */
public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("java视频");
    }
}
