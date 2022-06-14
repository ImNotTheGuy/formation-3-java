package courseDay3.exercise;

import java.util.HashMap;

public class Exercice23WithHashMap {
    public static void main(String[] args) {


        // created this array for readibility
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

            // check if current domain name was already in hashMap.
            // If it was, increment by 1/length (here 1/8)
            // If it wasn't, then give it value 1/length
            if (hashMap.containsKey(currentDomain)) {
                hashMap.put(currentDomain, (hashMap.get(currentDomain) + 1f / (float) emails.length));
            } else {
                hashMap.put(currentDomain, 1f / (float) emails.length);
            }
        }

        System.out.println(hashMap);

    }
}
