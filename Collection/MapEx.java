package Collection;
import java.util.Map;
import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();   // it will store key-value pairs with no particular order
        map.put(18, "Muskan");   // adding key-value pairs
        map.put(24, "Pratiksha" );
        map.put(21, "Ankita");
        map.put(24, "Sneha"); // Duplicate key, will update the value for key 24

        System.out.println("Map contents: " + map);
        System.out.println("Value for key 21: " + map.get(21));

        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

    }
}
