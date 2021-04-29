package chainofresponsibility;

import org.springframework.util.StringUtils;
/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/6 0006 20:24
 */
public class ValidateHandler extends Handler{
    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getUsername()) ||
                StringUtils.isEmpty(member.getPassword())) {
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        System.out.println("用户名：" + member.getUsername() + ",密码：" + member.getPassword());
        chain.doHandler(member);
    }
}
