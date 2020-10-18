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
