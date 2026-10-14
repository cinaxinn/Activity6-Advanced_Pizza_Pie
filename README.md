# Activity6-Advanced_Pizza_Pie
hello this is an explanation to my code (in a not very technical way).

just a disclaimer that my code is probably not the most efficient and convenient way to go about things. this is because i actually have no idea what i'm doing half the time.

## Pizza Base
Requirements: Abstract superclass with at least one data member, one concrete method, and one abstract method.

i added three classes (one abstract, two concrete) and a field that is useless (aside from meeting the requirements).

the two concrete classes include:

- `public static void takeOrder(PIZZA order)` -- method for user input :D
- `public static void payment(double amountDue)` -- method for payment output

i decided to make these methods so i wouldn't have to type them twice in the main function (bc i used an if-else for the choice D:).

the abstract class `public abstract double calculatePrice(String type)` is what calculates the price. parameter is there bc of the special pizza.

## Discountable
Requirements: Interface defining discount-related behavior.

yes

## PIZZA
Requirements: Concrete class representing a pizza order; extends PizzaBase and implements Discountable.

this class has the standard getter & setter methods. the setters are recursive though, in case they input smth invalid. 

i defined the abstract class `calculatePrice(String type)`, it does the calculations... it has an if statement that evaluates if the parameter is "special" or not. if yes, then an additional 15% will be charged (bc it's stuffed crust yum).

then the getter `getPrice()` returns `calculatePrice(regular)`. special pizza overrides it and does the same thing but places "special" as the parameter.

the `getDiscountRate()` from the interface checks the string and returns the discount rate in double format.

## SPECIAL_PIZZA
Requirements: Subclass of PIZZA that adds a meaningful characteristicorbehavior and overrides an inherited method.

this just overrides `getPrice();`

## BILL_ORDER
Requirements: Receives a pizza object, displays billing details, andreturnsthe amount due.

this is the same as activity 5 with an additional if-else to check if the parameter is special or not.

## TAKE_ORDER
Requirements: Main class that handles user input, creates/selects objects, calls methods, accepts payment, and computes change.

the main class is quite short bc i decided to shove most of the logic inside methods in other classes :D

---

thanks for reading!!!!!!!!!


