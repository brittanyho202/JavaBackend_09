package homework11;

//Question 2
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, "Manager", salary);
        this.bonus = bonus;
    }

    public double calculateTotalIncome() {
        return salary + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Bonus: $%.2f\n", bonus);
        System.out.printf("Total Income: $%.2f\n", calculateTotalIncome());
    }
}
