import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number to compare.");
        if (in.hasNextDouble()) {
            double numberOne = in.nextDouble();

        System.out.println("input the second number to compare.");
        if (in.hasNextDouble()) {
            double numberTwo = in.nextDouble();

            if (numberOne == numberTwo) {
                System.out.println("The numbers are equal to each other.");
            } else {
                if (numberOne <= numberTwo) {
                    System.out.println("The smaller number is: " + numberOne);
                } else {
                    System.out.println("The smaller number is: " + numberTwo);
                }
            }
        } else {
            System.out.println("Invalid input for the second number, try again.");
        }
        } else {
            System.out.println("Invalid input for the first number, try again.");
        }
    }
}