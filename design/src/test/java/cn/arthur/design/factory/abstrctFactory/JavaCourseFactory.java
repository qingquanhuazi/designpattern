package cn.arthur.design.factory.abstrctFactory;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 13:01
 */
public class JavaCourseFactory extends CourseFactory {
    @Override
    INote createNote() {
        return new JavaNote();
    }

    @Override
    IVideo createVideo() {
        return new JavaVideo();
    }
}
