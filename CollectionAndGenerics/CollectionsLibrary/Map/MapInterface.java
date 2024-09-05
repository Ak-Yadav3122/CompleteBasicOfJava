package CollectionAndGenerics.CollectionsLibrary.Map;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        // We always needs key and value. Here we perform String to Integer maping
        Map<String, Integer> map = new HashMap<>();

        // adding key-value pairs to the map

        map.put("Apple", 10);
        map.put("Banana", 12);
        map.put("Mango", 9);
        map.put("PineApple", 15);
        map.put("Grapes", 23);


        // .keySet() are used for Showing all key value pair
        System.out.println(map.keySet());

        // Accessing the value by using their key

        System.out.println(map.get("Apple"));
        System.out.println(map.get("PineApple"));

        // Checking if the key exist or not
        if (map.containsKey("Apple")) {
            System.out.println("Apple is exist and their quantity are: " + map.get("Apple"));
        }

        // Removing the key-value pair
        map.remove("Apple");
        System.out.println(map.keySet());

    }
}

// Note: Map Interface is the Interface which is the part of Collection Library
// But it is not the child of collection Interface.
// : It stored the key-value pairs, where each key can map at most one value.
// : Key are unique but multiple keys can map to the same value.