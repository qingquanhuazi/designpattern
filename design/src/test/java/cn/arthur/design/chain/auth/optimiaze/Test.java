package cn.arthur.design.chain.auth.optimiaze;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("arthur","666");
    }
}
