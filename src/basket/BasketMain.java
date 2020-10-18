package basket;

public class BasketMain {
    public static void main(String[] args) {

        Basket basket = new Basket();

        basket.addFruit("apple");
        basket.addFruit("banana");
        basket.addFruit("peach");
        basket.addFruit("melon");
        basket.addFruit("melon");
        basket.addFruit("melon");

        System.out.println(basket.findFruit("apple"));

        System.out.println(basket.removeFruit("banana"));
        basket.print();

        System.out.println(basket.positionOfFruit("peach"));

        System.out.println(basket.distinct());

        System.out.println(basket.customCount());
    }
}
