// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price: $");

        if (in.hasNextDouble()) {
            double priceItem = in.nextDouble();
            double shippingCost;

            if (itemPrice >= 100) {
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