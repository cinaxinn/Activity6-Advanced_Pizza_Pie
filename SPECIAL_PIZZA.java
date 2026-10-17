public class SPECIAL_PIZZA extends PIZZA {
    @Override
    public double getPrice() {
        return this.calculatePrice("Special");
    }
}
