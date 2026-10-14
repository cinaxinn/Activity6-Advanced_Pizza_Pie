import java.util.Scanner;

public class TAKE_ORDER {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("======================\nPIZZA ORDERING SYSTEM\n======================");
        System.out.println("Enter Pizza Type:\n1. Regular\n2. Special Pizza");

        int choice;
        do {
            System.out.print("Choice: ");
            choice = Integer.parseInt(scan.nextLine());

            if (!(choice == 1 || choice == 2)) {
                System.out.println("Invalid choice.");
            }
        } while (!(choice == 1 || choice == 2));

        System.out.println();

        PIZZA order;
        if (choice == 1) {
            order = new PIZZA();
        } else  {
            order = new SPECIAL_PIZZA();
        }

        PizzaBase.takeOrder(order);
        double amountDue = BILL_ORDER.OUT(order);
        PizzaBase.payment(amountDue);

    }

}

