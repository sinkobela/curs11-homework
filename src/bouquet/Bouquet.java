package bouquet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Bouquet {
    Set<String> flowers = new HashSet<>();

    public Collection<String> getAll() {
        return new HashSet<>(flowers);
    }

    public void add(String flower) {
        flowers.add(flower);
    }

    public void remove(String flower) {
        flowers.remove(flower);
    }

}


//    Create an objects that model buquet of flowers. Each flower has to be unique. We don't care how the flowers are ordered
//        - getAll(): Collection<String>  - returns all the flowers
//        - add(String)    - adds a flower (remember to keep them unique)
//        - remove(String) - removes a flower