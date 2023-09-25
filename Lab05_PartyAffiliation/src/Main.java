import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your party affiliation: ");
        System.out.println("D for Democrat");
        System.out.println("R for Republican");
        System.out.println("I for Independent");
        System.out.println("Pick one of the options: ");

        String choice = in.next();

        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (choice.equals("I")) {
            System.out.println("You're an Independent");
        } else {
            System.out.println("You're associated with Other.");
        }
    }
}