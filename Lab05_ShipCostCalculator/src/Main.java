import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price: $");

        if (in.hasNextDouble()) {
            double priceItem = in.nextDouble();
            double shippingCost;

            if (priceItem >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = 0.02 * priceItem;
            }

            double totalPrice = priceItem + shippingCost;

            System.out.println("The Shipping Cost is: $" + shippingCost);
            System.out.println("The Total Price is: $" + totalPrice);
        } else {
            System.out.println("Not a valid input.");
        }

    }
}