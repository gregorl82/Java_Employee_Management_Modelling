package staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage){
        if (percentage > 0){
            salary *= (1 + (percentage/100));
        }
    }

    public double payBonus(){
        return 0.01 * salary;
    }
}
