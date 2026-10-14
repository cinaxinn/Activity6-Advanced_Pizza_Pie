import java.util.Scanner;

abstract class PizzaBase {
    protected String currency = "PHP";

    // abstract method
    public abstract double calculatePrice(String type);

    // concrete method
    public static void takeOrder(PIZZA order) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Toppings: ");
        order.setToppings(scan.nextLine());
        System.out.print("Enter Diameter in inches: ");
        order.setDiameter(Integer.parseInt(scan.nextLine()));
        System.out.print("Enter How Many?: ");
        order.setHowMany(Integer.parseInt(scan.nextLine()));
        System.out.print("Enter Type of Discount: ");
        order.setDiscount(scan.nextLine());
        System.out.println();

    }

    public static void payment(double amountDue) {
        Scanner scan = new Scanner(System.in);

        double amountReceived = 0;
        do {
            System.out.print("Enter Amount Received: ");
            amountReceived = scan.nextDouble();

            if (amountReceived < amountDue) {
                System.out.println("Amount Received must be greater than Amount Due.");
            }
        } while (amountReceived < amountDue);
        System.out.printf("Change: PHP %.2f", (amountReceived-amountDue));

    }

}
