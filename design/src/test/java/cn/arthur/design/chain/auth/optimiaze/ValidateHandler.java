package cn.arthur.design.chain.auth.optimiaze;


import cn.arthur.design.chain.auth.Member;
import org.springframework.util.StringUtils;

/**
 * Created by arthur.
 */
public class ValidateHandler extends Handler {
    public void doHandler(Member member) {
        if(StringUtils.isEmpty(member.getLoginName()) ||
                StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        next.doHandler(member);
    }
}
