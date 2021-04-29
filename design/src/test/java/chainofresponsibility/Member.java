package chainofresponsibility;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/6 0006 20:20
 */
@Data
public class Member {
    private String username;
    private String password;
    private String roleName;
    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

}
