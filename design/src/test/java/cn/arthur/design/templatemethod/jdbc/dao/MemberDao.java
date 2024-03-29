package cn.arthur.design.templatemethod.jdbc.dao;



import cn.arthur.design.templatemethod.jdbc.entity.Member;
import cn.arthur.design.templatemethod.jdbc.framework.JdbcTemplate;
import cn.arthur.design.templatemethod.jdbc.framework.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;


/**
 * Created by arthur.
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
            Member member = new Member();
            //字段过多，原型模式
            member.setUsername(rs.getString("username"));
            member.setPassword(rs.getString("password"));
            member.setAge(rs.getInt("age"));
            member.setAddr(rs.getString("addr"));
            return member;
            }
        },null);
    }
}
