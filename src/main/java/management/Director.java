package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nINumber, double salary, String department, double budget){
        super(name, nINumber, salary, department);
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }

}
