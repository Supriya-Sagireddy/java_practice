package inheritace.EmployeeInherit;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("John", 50000.0, 10000.0);
        Employee engineer = new Engineer("Alice", 60000.0, 5000.0);
        Employee salesperson = new Salesperson("Bob", 40000.0, 3000.0);

        manager.displayDetails();
        System.out.println("Total Salary: $" + manager.calculateSalary());

        engineer.displayDetails();
        System.out.println("Total Salary: $" + engineer.calculateSalary());

        salesperson.displayDetails();
        System.out.println("Total Salary: $" + salesperson.calculateSalary());
    }
}
