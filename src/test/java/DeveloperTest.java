import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Henry MacDonald", "DE264364P", 25000.0);
    }

    @Test
    public void hasName(){
        assertEquals("Henry MacDonald", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("DE264364P", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.0, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(3.0);
        assertEquals(25750.0, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalary(){
        developer.raiseSalary(-1.5);
        assertEquals(25000.0, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(250.0, developer.payBonus(), 0.01);
    }
}
