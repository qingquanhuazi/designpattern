package chainofresponsibility.builder;

import chainofresponsibility.builder.AuthHandler;
import chainofresponsibility.builder.LoginHandler;
import chainofresponsibility.Member;
import chainofresponsibility.builder.ValidateHandler;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/6 0006 20:33
 */
public class MemberService {
    public void login(String userName, String password) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandler(new Member(userName, password));
    }

    public static void main(String[] args) {
        chainofresponsibility.builder.MemberService service = new chainofresponsibility.builder.MemberService();
        service.login("C语言中文网", "http://c.biancheng.net");
    }
}
