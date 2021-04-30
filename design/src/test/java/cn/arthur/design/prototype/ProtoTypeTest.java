package cn.arthur.design.prototype;

import org.junit.Test;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/3/23 0023 22:27
 */
public class ProtoTypeTest {
    @Test
    public void protoType() {
        Ceramics ceramics = new Ceramics();
        ceramics.setBody("青花瓷");
        Student student = new Student();
        student.setName("1");
        ceramics.setStudent(student);
        try {
            Ceramics ceramics1 = ceramics.clone();
            ceramics1.getStudent().setName("2");
            System.out.println(ceramics.getStudent() + "," + ceramics1.getStudent());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void jsonProtoType() {
        ProtoType protoType = new ProtoType();
        protoType.setName("1");
        ProtoType protoType1 = protoType.jsonClone();
        protoType1.setName("2");
        System.out.println(protoType.getName()+ protoType1.getName());
    }
}
