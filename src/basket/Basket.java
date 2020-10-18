package basket;

import java.util.*;

public class Basket {

    private final List<String> fruits = new ArrayList<>();

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public void print() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public boolean findFruit(String fruitSearched) {
        for (String fruit : fruits) {
            if (fruit.equals(fruitSearched)) {
                return true;
            }
        }
        return false;
    }

    public boolean removeFruit(String fruitSearched) {
        final Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            if (fruitIterator.next().equals(fruitSearched)) {
                fruitIterator.remove();
                return true;
            }
        }
        return false;
    }

    public int positionOfFruit(String fruitSearched) {
        return fruits.indexOf(fruitSearched);
    }

    public Collection<String> distinct() {
        return new HashSet<>(fruits);
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int count = 0;
        final Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            count++;
            fruitIterator.next();
        }
        return count;
    }

}
