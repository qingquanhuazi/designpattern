package cn.arthur.design.templatemethod.jdbc;


import cn.arthur.design.templatemethod.jdbc.dao.MemberDao;

import java.util.List;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
