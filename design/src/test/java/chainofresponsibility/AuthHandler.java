package chainofresponsibility;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/6 0006 20:25
 */
public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("您是管理员，允许操作");
    }
}
