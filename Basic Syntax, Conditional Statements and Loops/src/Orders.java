import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        for (int i = 0; i < countOfOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double currentPrice = (days * capsulesCount) * pricePerCapsule;
            totalPrice += currentPrice;
            System.out.printf("The price for the coffee is: $%.2f%n" , currentPrice);
        }
        System.out.printf("Total: $%.2f" , totalPrice);


    }
}
