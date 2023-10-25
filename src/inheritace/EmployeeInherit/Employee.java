package inheritace.EmployeeInherit;

public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
    }
}
