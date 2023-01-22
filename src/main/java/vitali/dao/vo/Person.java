package vitali.dao.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vitali.dao.annotation.MyColumn;
import vitali.dao.annotation.MyTable;

/**
 * It is class Person.
 * @author Administrator
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@MyTable(name = "Person")
public class Person {

    /**
     * Some description here.
     * description.
     */
    @MyColumn(name = "id")
    private int id;

    /**
     * Some description here.
     * description.
     */
    @MyColumn(name = "name")
    private String name;

    /**
     * Some description here.
     * description.
     */
    @MyColumn(name = "surname")
    private String surname;


}
