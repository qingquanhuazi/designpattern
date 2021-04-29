package cn.arthur.design.prototype;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/3/23 0023 22:27
 */
public class ProtoTypeTest {

    public static void main(String[] args) {
    Ceramics ceramics=new Ceramics();
    ceramics.setBody("青花瓷");
        try {
            Ceramics ceramics1 = ceramics.clone();
            ceramics1.setBody("白釉瓷");
            System.out.println(ceramics.getBody()+","+ceramics1.getBody());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
