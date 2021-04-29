package chainofresponsibility;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/6 0006 20:23
 */
@Data
public class MemberService {
    public void login(String userName, String password) {
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();
        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(new Member(userName, password));
    }

    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.login("C语言中文网", "http://c.biancheng.net");
    }
}
