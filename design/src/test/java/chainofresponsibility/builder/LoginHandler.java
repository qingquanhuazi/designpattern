package chainofresponsibility.builder;

import chainofresponsibility.builder.Handler;
import chainofresponsibility.Member;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/6 0006 20:25
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        chain.doHandler(member);
    }
}
