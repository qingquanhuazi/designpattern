package cn.arthur.design.prototype;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 0:29
 */
@Data
public class Student implements Cloneable {
    private String name;

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
