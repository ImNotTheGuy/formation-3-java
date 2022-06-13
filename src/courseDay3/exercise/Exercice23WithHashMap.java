package courseDay3.exercise;

import java.util.HashMap;

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
            // String manipulation to extract domain name.
            String email = emails[i];
            int startIndex = email.indexOf('@');
            String tempDomain = email.substring(startIndex);
            int endIndex = tempDomain.indexOf('.') + startIndex;
            currentDomain = email.substring(startIndex+1, endIndex);
            System.out.println(currentDomain);

            if (hashMap.containsKey(currentDomain)) {
                hashMap.put(currentDomain, ((float) hashMap.get(currentDomain) * 8f + 1f) / 8f);
            } else {
                hashMap.put(currentDomain, 1f/8f);
            }
        }

        System.out.println(hashMap);

    }
}
