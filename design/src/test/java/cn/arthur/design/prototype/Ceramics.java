package cn.arthur.design.prototype;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/3/23 0023 22:21
 */
@Data
public class Ceramics implements Cloneable {
    private String body;
    private Student student;

    @Override
    public Ceramics clone() throws CloneNotSupportedException {
        //浅克隆
        //return (Ceramics) super.clone();
        //深克隆
        Ceramics ceramics = (Ceramics) super.clone();
        ceramics.setStudent(ceramics.getStudent().clone());
        return ceramics;
    }


}
