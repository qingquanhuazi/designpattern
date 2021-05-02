package cn.arthur.design.templatemethod.jdbc.framework;

import java.sql.ResultSet;

/**
 * Created by Tom.
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;

}
