package vitali.dao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Table name corresponding to vo class.
 *
 * @author Administrator
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface MyTable {

    /**
     * Some description here.
     *
     * @return description.
     */
    String name();

}
