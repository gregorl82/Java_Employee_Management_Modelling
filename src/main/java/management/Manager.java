package management;

import staff.Employee;

public class Manager extends Employee {

    private String department;

    public Manager(String name, String nINumber, double salary, String department){
        super(name, nINumber, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
