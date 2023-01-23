package vitali.dao.utils;

import java.util.ResourceBundle;

/**
 * It is class DatabaseProperties.
 *
 * @author Administrator
 *
 */
public final class DatabaseProperties {

    /**
     * constructor.
     *
     */
    private DatabaseProperties() {
    }

    /**
     * Resource.
     *
     */
    private static final ResourceBundle RESOURCE = ResourceBundle.getBundle("database");

    /**
     * Url.
     *
     */
    public static final String URL = RESOURCE.getString("url");

    /**
     * Driver.
     *
     */
    public static final String DRIVER = RESOURCE.getString("driver");

    /**
     * User.
     *
     */
    public static final String USER = RESOURCE.getString("user");

    /**
     * Path.
     *
     */
    public static final String PASS = RESOURCE.getString("pass");
}
