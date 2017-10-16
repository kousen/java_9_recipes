package collections;

import java.util.Map;

import static java.util.Map.entry;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.ofEntries(entry("a", 1),
                entry("b", 2),
                entry("c", 3));
    }
}
