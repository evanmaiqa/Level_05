package MapSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();
        map.put('1', "One");
        map.put('9', "Two");
        map.put('0', "Three");
        map.put('0', "Four");
        map.put('A', "One");
        System.out.println(map);
        System.out.println(map.get(10));
        System.out.println(map.size());
        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("One"));

        System.out.println("---------------------------------");

        Set<Character> keys = new HashSet<>();
        keys.add('A');
        keys.add('B');
        keys.add('A');
        System.out.println(keys);
// keys
        keys = map.keySet();
        System.out.println(keys);
        System.out.println("keys:");
        for (Character key : keys) {
            System.out.println(key);
        }
// values
        System.out.println("values:");
        Collection<String> values = map.values();
        for (String str : values) {
            System.out.println(str);
        }
// iterator
        System.out.println(" - iterator -");

        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator = values.iterator();
        for (Iterator<String> it = iterator; it.hasNext();) {
            String value = it.next();
            System.out.println(value);
        }
// Array sort
        String[] arr = new String[] {"One", "Two", "Three"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
