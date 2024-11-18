package nocoffee;

public class Main {
    public static void main(String[] args) {
//        DarkCoffee coffee = new DarkCoffee();
//        System.out.println(coffee.getDescription() + " - " + coffee.calculatePrice());
        Order firstOrder = new Order();
        IBeverage darkCoffee = new DarkCoffee();

        firstOrder.setBeverage(darkCoffee);
        System.out.println(firstOrder.calculatePrice());
    }
}
