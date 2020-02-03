import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jimbob Walton", "XV023407P", 45000.0, "Cattle Herding");
    }

    @Test
    public void hasName(){
        assertEquals("Jimbob Walton", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("XV023407P", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(45000.0, manager.getSalary(), 0.01);
    }

    @Test
    public void hasADepartmentName(){
        assertEquals("Cattle Herding", manager.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(4.5);
        assertEquals(47025.0, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(450.0, manager.payBonus(), 0.01);
    }



}
