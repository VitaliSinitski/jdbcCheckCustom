package vitali.dao.dao;

import java.sql.SQLException;
import vitali.dao.vo.Person;

/**
 * It is class DaoMain.
 *
 * @author Administrator
 *
 */
public class DaoMain {

    /**
     * Some description here.
     * description.
     */
    public static void main(String[] args) throws SQLException {
        DaoPerson daoPerson = new DaoPersonImpl();

        Person person1 = Person.builder().name("Max").surname("Dillon").build();
        daoPerson.save(person1);

        Person person = daoPerson.get(8);
        System.out.println(person);

        person.setName("Wanda");
        person.setSurname("Jones");

        daoPerson.update(person);

        //        daoPerson.delete(9);
    }
}
