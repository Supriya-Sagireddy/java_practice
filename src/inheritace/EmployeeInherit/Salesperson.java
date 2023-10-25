package inheritace.EmployeeInherit;

public class Salesperson extends Employee {
    private double commission;

    public Salesperson(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + commission;
    }
}
