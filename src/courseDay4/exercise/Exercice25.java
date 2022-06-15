package courseDay4.exercise;

import java.util.Locale;

public class Exercice25 {
    public static void main(String[] args) {
        /*Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite retourne un
        booléen(true/false) selon que le 2ème string est le préfixe du premier ou pas.
        Ex :
        isPrefix("banner", "bang")
        > false
        isPrefix("hugging", "hug")
        > true*/

        System.out.println(isPrefix("Hugging", "Hug"));
        System.out.println(isPrefix("Bugging", "Hug"));
        System.out.println(isPrefix("Hug", "Hugging"));

    }

    static boolean isPrefix(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str2.length() > str1.length()){
            System.out.println("String 2 is bigger than string 1 !");
            return false;
        }
        str1 = str1.substring(0,str2.length());

        return str1.equals(str2);
    }

}
