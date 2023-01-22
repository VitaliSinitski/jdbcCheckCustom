package vitali.dao.utils;

import java.util.ResourceBundle;

public final class DatabaseProperties {
    private DatabaseProperties() {
    }

    private static final ResourceBundle RESOURCE = ResourceBundle.getBundle("database");
    public static final String URL = RESOURCE.getString("url");
    public static final String DRIVER = RESOURCE.getString("driver");
    public static final String USER = RESOURCE.getString("user");
    public static final String PASS = RESOURCE.getString("pass");
}
