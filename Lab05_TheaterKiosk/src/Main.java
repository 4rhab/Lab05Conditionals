import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();

            if (age >= 21) {
                System.out.println("You get a wristband.");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}