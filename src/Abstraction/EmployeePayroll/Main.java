package Abstraction.EmployeePayroll;

public class Main {
    public static void main(String[] args) {
        Employee hourlyEmployee = new HourlyEmployee("John", 101, 15.0, 160);
        Employee salariedEmployee = new SalariedEmployee("Alice", 102, 5000.0);

        System.out.println("Hourly Employee Salary: $" + hourlyEmployee.calculateSalary());
        System.out.println("Salaried Employee Salary: $" + salariedEmployee.calculateSalary());
    }
}

