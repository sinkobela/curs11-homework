package bouquet;

public class BouquetMain {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        bouquet.add("rose");
        bouquet.add("cactus");
        bouquet.add("tulip");
        bouquet.add("sunflower");
        bouquet.add("orchid");

        bouquet.remove("sunflower");

        System.out.println(bouquet.getAll());
    }
}
