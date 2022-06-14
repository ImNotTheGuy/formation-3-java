package courseDay3.exercise;

import java.util.ArrayList;
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

        // created
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


        // 2 arrayLists containing the domains (one with duplicates, one without)
        // the one with no duplicates is used to have the list of the domains, while
        // the other is used to count the occurrences of each domain name
        ArrayList<String> domainsNoDuplicates = new ArrayList<String>();
        ArrayList<String> domainsWithDuplicates = new ArrayList<String>();

        String currentEmail;

        // loop through the emails list, do some string manipulation to extract the
        // domain name. If domain name is not yet in NoDuplicates, add it. If it isn't,
        // pass. In any case, add the domain to the WithDuplicates array
        for (int i = 0; i < emails.length; i++) {
            currentEmail = emails[i];
            String domainName = currentEmail.substring(currentEmail.indexOf('@'),currentEmail.length());
            domainsWithDuplicates.add(domainName);
            if (!domainsNoDuplicates.contains(domainName)){
                domainsNoDuplicates.add(domainName);
            }
        }

        // for readibility
        float occurrencePercentage;
        int numberOfEmails = emails.length;

        System.out.println();

        // loop through NoDuplicates, and for each item count the number of times
        // it was found in the WithDuplicates array.
        // Compute and output the % of occurrence / total(emails)
        for (int i = 0; i < domainsNoDuplicates.size(); i++) {
            String currentDomain = domainsNoDuplicates.get(i);
            occurrencePercentage = ((float) Collections.frequency(domainsWithDuplicates, currentDomain)) / numberOfEmails * 100;
            System.out.printf("Domain %s represents %s %% of the total emails\n", currentDomain, occurrencePercentage);
        }
    }
}
