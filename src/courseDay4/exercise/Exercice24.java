package courseDay4.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercice24 {
    public static void main(String[] args) {

        /*
        Ecrire un programme Java qui permet à l'utilsation de déclarer 2 tableaux:
        1 tableau correspondant au numéro du jour de la semaine(ex : 1 pour Lundi)
        1 tableau correspondant au nom des jours de la semaine(Ex : Lundi)
        Associer les 2 informations dans un HashMap
        Permettre à l'utilisation d'associer via un HasMap le numéro correspondant au
         jour et le jour de la semaine correspondant.
        * */

        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> weekDayHashMap = new HashMap<>();

        String weekDayStr[] = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};

        int weekDayInt[] = new int[weekDayStr.length];

        // create index table + hashmap by looping through the weekDayStr array.
        for (int i = 0; i < weekDayInt.length; i++) {
            weekDayInt[i] = i + 1;
            weekDayHashMap.put(i + 1, weekDayStr[i].toUpperCase());
        }

        boolean intSearch; // if true: the user wants to lookup by index (key); if false: by string (value)
        String searchType;

        System.out.printf("\n\n\n\n- if searching by index, type 'int'\n- if searching by String, type 'str': ");

        while (true) {

            searchType = input.nextLine();
            if (searchType.equals("str")) {
                intSearch = false;
                break;
            } else if (searchType.equals("int")) {
                intSearch = true;
                break;
            } else {
                System.out.println("Specify correct type\n");
            }
        }

        int lookupInt;
        String lookupStr;

        while (true) {

            if (intSearch) {

                // when searching by index

                System.out.printf("day number to lookup: ");
                lookupInt = input.nextInt();

                // check if int exists in keys (1-7)
                if (weekDayHashMap.containsKey(lookupInt)) {

                    // loop through the hashmap and check equality currentKey = keyLookedUp
                    for (Map.Entry<Integer, String> entry : weekDayHashMap.entrySet()) {
                        if (entry.getKey().equals(lookupInt)) {
                            System.out.printf("Key [%d] has value: %s\n", lookupInt, entry.getValue());
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("Incorrect entry, try again");
                }

            } else {

                // when searching by string

                System.out.printf("day to lookup: ");
                lookupStr = input.nextLine().toUpperCase();

                // check if string exists in values

                if (weekDayHashMap.containsValue(lookupStr)) {

                    // loop through the hashmap and check equality currentValue = valueLookedUp
                    for (Map.Entry<Integer, String> entry : weekDayHashMap.entrySet()) {
                        if (entry.getValue().equals(lookupStr)) {
                            System.out.printf("Value %s has key [%d]\n", lookupStr, entry.getKey());
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("Incorrect entry, try again");
                }
            }
        }










/*
        while (true){

            System.out.printf("\nday number: ");
            // inputValue is used for escaping the loop when user types "".
            String inputValue = input.next();

            if (inputValue.equals("bye") && userWeekDayHashMap.size() == correctWeekDayHashMap.size()){
                break;
            } else if (inputValue.equals("bye")){
                System.out.println("Mapping is not complete, please continue");
            } else {

                dayInt = Integer.valueOf(inputValue);

                if (correctWeekDayHashMap.containsKey(dayInt)) {

                    System.out.printf("\nday value: ");
                    dayStr = input.next().toUpperCase();
                    String correctValue = correctWeekDayHashMap.get(dayInt);
                    if (correctValue.equals(dayStr)) {
                        userWeekDayHashMap.put(dayInt, dayStr);
                        System.out.printf("Ok, added the following entry: %d=%s", dayInt, dayStr);
                        System.out.printf("\n\nYour mapping looks like this %s\n\n", userWeekDayHashMap);
                    } else {
                        System.out.printf("Sorry, day %d should not have for value: %s. Try again", dayInt, dayStr);
                    }
                } else {
                    System.out.printf("Sorry, day number %d should be between 1-7. Try again", dayInt);
                }
            }



        }*/


    }
}
