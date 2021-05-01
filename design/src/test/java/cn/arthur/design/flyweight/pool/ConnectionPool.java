package cn.arthur.design.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 17:28
 */
public class ConnectionPool {
    private Vector<Connection> pool;
    private String url = "jdbc:mysql://203.195.158.178";
    private String username = "root";
    private String password = "BG/ep9Q.~k(t2_3L";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 10;

    public ConnectionPool() {
        pool = new Vector<Connection>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                Connection conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }
        return null;
    }

    public synchronized void release(Connection connection) {
        pool.add(connection);
    }
}
