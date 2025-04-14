package homework11;

//Question 2
public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Brittany Ho", 10_000, 1_200);
        Worker worker = new Worker("Hannah Lee", 3_000);

        System.out.println("Manager Info:");
        manager.displayInfo();

        System.out.println("\nWorker Info:");
        worker.displayInfo();
    }
}
