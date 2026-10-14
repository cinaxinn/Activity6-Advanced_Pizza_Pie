public class BILL_ORDER {
   public static double OUT(PIZZA order) {

        System.out.println("---------------------");
        System.out.println("ORDER DETAILS");
        System.out.println("---------------------");
        if (order instanceof SPECIAL_PIZZA) {
            System.out.println("Pizza Type: Special Pizza");
        } else {
            System.out.println("Pizza Type: Regular Pizza");
        }
        System.out.println("Toppings: " + order.getToppings());
        System.out.println("Diameter: " + order.getDiameter() + " cm");
        System.out.println("Quantity: " + order.getHowMany());
        System.out.println("Discount Rate: " + (int)(order.getDiscountRate()*100) + "%");
        System.out.println("Amount Due: PHP " + String.format("%.2f", order.getPrice()) + "\n");

        return order.getPrice();
    }
}
