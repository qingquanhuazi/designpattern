package cn.arthur.design.iterator.course;

/**
 * Created by arthur.
 */
public interface ICourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
