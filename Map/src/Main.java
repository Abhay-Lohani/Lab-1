public class Main {
    public static void main(String[] args) {
        KeyValueStore<String, Integer> map = new KeyValueStore<>();

        // Adding key-value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put("one", 3);
        map.put("one", 4);

        // Checking the size of the map
        System.out.println("Size: " + map.size());

        // Retrieving value by key
        System.out.println("Value for 'one': " + map.get("one"));

        // Checking if a key exists
        System.out.println("Contains 'two': " + map.contains("two"));
    }
}
