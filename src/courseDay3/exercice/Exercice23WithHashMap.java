package courseDay3.exercice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Exercice23WithHashMap {
    public static void main(String[] args) {


        String[] emails =  {
                "christian.lisangola@gmail.com",
                "jean.paul@gmail.com",
                "alain@gmail.com",
                "lydie@yahoo.fr",
                "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr",
                "philemon.turion@gmail.com",
                "jules.cesar@hotmail.fr"
        };

        HashMap<String, Float> hashMap = new HashMap<>();

        String currentDomain;

        for (int i = 0; i < emails.length; i++) {
            currentDomain = emails[i].substring(emails[i].indexOf("@")+1);
            if (hashMap.containsKey(currentDomain)) {
                hashMap.put(currentDomain, ((float) hashMap.get(currentDomain) * 8f + 1f) / 8f);
            } else {
                hashMap.put(currentDomain, 1f/8f);
            }
        }

        System.out.println(hashMap);

    }
}
