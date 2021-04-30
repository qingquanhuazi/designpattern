package cn.arthur.design.factory.abstrctFactory;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 12:51
 */
public abstract class CourseFactory {
    abstract INote createNote();

    abstract IVideo createVideo();
}
