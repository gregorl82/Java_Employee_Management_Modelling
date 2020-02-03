import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Richard Branson", "AA010203Z", 130000.0, "Executive Management", 1000000.0);
    }

    @Test
    public void hasName(){
        assertEquals("Richard Branson", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AA010203Z", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(130000.0, director.getSalary(), 0.01);
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Executive Management", director.getDepartment());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000.0, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5.0);
        assertEquals(136500.0, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1300.0, director.payBonus(), 0.01);
    }
}
