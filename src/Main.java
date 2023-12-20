import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of floors: ");
        int amount = scanner.nextInt();
        System.out.println();

        while (amount <= 1) {
            System.out.println("Wrong data! Try again");
            amount = scanner.nextInt();
        }

        LoopForElevators evenElevator = new LoopForElevators(amount);
        LoopForElevators oddElevator = new LoopForElevators(amount);
        LoopForElevators employeeElevator = new LoopForElevators(amount);

        Person person1 = new Person(Person.Role.EMPLOYEE);

        /*try {
            evenElevator.callElevator();
        } catch {

        }*/
    }
}