package inheritace.EmployeeInherit;

public class Engineer extends Employee {
    private double overtimePay;

    public Engineer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}



