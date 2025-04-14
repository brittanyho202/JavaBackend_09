package homework11;

// Question 2
public class Employee {
    protected String name;
    protected String position;
    protected double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.printf("Salary: $%.2f\n", salary);
    }
}
