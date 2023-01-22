package vitali.dao.utils;

import vitali.dao.annotation.MyColumn;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 * It is class DaoUtils.
 * @author Administrator
 *
 */
public class DaoUtils {

    /**
     * Get database connection.
     *
     * @return connection.
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DatabaseProperties.URL,
                    DatabaseProperties.USER, DatabaseProperties.PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * Close resources.
     *
     * @param auto
     */
    public static void close(final AutoCloseable auto) {
        if (auto != null) {
            try {
                auto.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Close resources.
     * @param c
     * @return list
     */
    public List<String> tableColumns(final Class c) {
        Field[] fields = c.getDeclaredFields();
        List<String> list = new ArrayList<>();
        for (Field f : fields) {
            MyColumn myColumn = f.getAnnotation(MyColumn.class);
            list.add(myColumn.name());
        }
        return list;
    }

}
