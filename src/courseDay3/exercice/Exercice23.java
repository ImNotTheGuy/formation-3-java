package courseDay3.exercice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exercice23 {
    public static void main(String[] args) {

        /*
        Ecrire un programme Java qui remplit un tableau avec une liste des adresse email :
        christian.lisangola@gmail.com, jean.paul@gmail.com, alain@gmail.com, lydie@yahoo.fr,
        josephine.lajoie@yahoo.com, luise@hotmail.fr, philemon.turion@gmail.com, jules.cesar@hotmail.fr
        Ensuite le programme va afficher en % le taux d'adresse gmail, yahoo et hotmail.
        Essayer de le résoudre au plus, et essayer approche basé sur le HMap.
        */

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

        ArrayList<String> domainsNoDuplicates = new ArrayList<String>();
        ArrayList<String> domainsWithDuplicates = new ArrayList<String>();

        String currentEmail;

        for (int i = 0; i < emails.length; i++) {
            currentEmail = emails[i];
            String domainName = currentEmail.substring(currentEmail.indexOf('@'),currentEmail.length());
            domainsWithDuplicates.add(domainName);
            if (!domainsNoDuplicates.contains(domainName)){
                domainsNoDuplicates.add(domainName);
            }
        }

        float occurrencePercentage;
        int numberOfEmails = emails.length;


        for (int i = 0; i < domainsNoDuplicates.size(); i++) {
            String currentDomain = domainsNoDuplicates.get(i);
            System.out.println((float) Collections.frequency(domainsWithDuplicates, currentDomain) / numberOfEmails);
            occurrencePercentage = ((float) Collections.frequency(domainsWithDuplicates, currentDomain)) / numberOfEmails * 100;
            System.out.printf("Domain %s represents %s percent of the total emails\n", currentDomain, occurrencePercentage);
        }








    }
}
