package cn.arthur.design.prototype;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/3/23 0023 22:21
 */
public class Ceramics implements Cloneable {
    private String body;

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override
    public Ceramics clone() throws CloneNotSupportedException {
        //深克隆
        return (Ceramics) super.clone();
    }
}
