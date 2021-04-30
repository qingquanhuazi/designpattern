package cn.arthur.design.factory.abstrctFactory;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 13:00
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory javaFactory=new JavaCourseFactory();
        javaFactory.createNote().edit();
        javaFactory.createVideo().record();
    }
}
