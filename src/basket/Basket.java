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


//    Create an object Basket that holds the fruits.
//        - find(String):boolean      - finds if received fruit is in the list and returns true/false
//        - remove(String): boolean   - removes the received string returns true/false if found
//        - position(String):int     - returns the position on which the received fruit is in the basket
//        - distinct(): Collection<String>  - returns an unique collection containing all fruits once
//        - add(String) - adds a fruit to the basket
//        - count():int    - count the fruits
//        - customCount():int - count the fruits without using size method (use a loop control statement + counter)