import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Alan Johnson", "JN823064Q", 29000.0);
    }

    @Test
    public void hasName(){
        assertEquals("Alan Johnson", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JN823064Q", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(29000.0, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(3.0);
        assertEquals(29870.0, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(290.0, databaseAdmin.payBonus(), 0.01);
    }
}
