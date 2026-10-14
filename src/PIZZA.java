import java.util.Scanner;

public class PIZZA extends PizzaBase implements Discountable {
    Scanner scan = new Scanner(System.in);
    private String toppings;
    private String discount;
    private double diameter;
    private int howMany;
    private double price;

    public void setToppings(String toppings) {
        if (toppings.equalsIgnoreCase("Pepperoni") || toppings.equalsIgnoreCase("Ham and Cheese") || toppings.equalsIgnoreCase("Hawaiian")) {
            this.toppings = toppings;
        } else {
            System.out.println("Please input a valid topping. (Pepperoni, Ham & Cheese, or Hawaiian");
            System.out.print("Enter Toppings: ");
            this.setToppings(scan.nextLine());
        }
    }

    public void setDiameter(double diameter) {
        if (diameter > 0) {
            this.diameter = diameter*2.54;
        } else {
            System.out.println("Please input a positive diameter.");
            System.out.print("Enter Diameter in inches: ");
            this.setDiameter(Double.parseDouble(scan.nextLine()));
        }
    }

    public void setHowMany(int howMany) {
        if (howMany > 0) {
            this.howMany = howMany;
        } else {
            System.out.println("Please input a positive quantity.");
            System.out.printf("%-27s", "Enter How Many?:");
            this.setHowMany(Integer.parseInt(scan.nextLine()));
        }
    }

    public void setDiscount(String discount) {
        if (discount.equalsIgnoreCase("VIPCard") || discount.equalsIgnoreCase("Senior Citizen") || discount.equalsIgnoreCase("No Discount")) {
            this.discount = discount;
        } else {
            System.out.println("Please input a valid topping. (Senior Citizen, VIPCard, or No Discount)");
            System.out.printf("%-27s", "Enter Type of Discount:");
            this.setDiscount(scan.nextLine());
        }
    }

    public String getToppings() {
        return this.toppings;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public int getHowMany() {
        return this.howMany;
    }

    // abstract method from PizzaBase
    public double calculatePrice(String type) {
        this.price = 0;
        switch (this.toppings.toLowerCase()) {
            case "pepperoni":
                this.price += 100;
                break;
            case "ham and cheese":
                this.price += 150;
                break;
            case "hawaiian":
                this.price += 200;
                break;
        }

        this.price += (this.diameter*5);

        // special pizza charge (for stuffed crust)
        // additional 15% charge
        if (type.equalsIgnoreCase("Special")) {
            this.price *= 1.15;
        }

        this.price *= this.howMany;

        // uses interface method
        this.price *= (1-this.getDiscountRate());

        return this.price;
    }

    public double getPrice() {
        return this.calculatePrice("Regular");
    }

    public double getDiscountRate() {
        switch (this.discount.toLowerCase()) {
            case "senior citizen":
                return 0.20;
            case "vipcard":
                return 0.12;
            default:
                return 0;
        }
    }




}
