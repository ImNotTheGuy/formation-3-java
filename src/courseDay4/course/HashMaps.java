package courseDay4.course;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        String str = "JE SUIS HEUREUX".replace(" ", "").toUpperCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(hashMap);
            if (hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
            } else {
                hashMap.put(str.charAt(i),1);
            }
        }
        System.out.println(hashMap);
        var test = hashMap.values();;
        System.out.println(test);

        hashMap.remove('J');
        System.out.println("After deleting J " +  hashMap);


        for (Map.Entry<Character, Integer> entry:hashMap.entrySet()){
            System.out.println("Key: " + entry.getKey());
        }

        System.out.println(hashMap);
        System.out.println(hashMap.entrySet());

        for (Map.Entry<Character, Integer> entry:
             hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
