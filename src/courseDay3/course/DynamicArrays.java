package courseDay3.course;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrays {

    public static void main(String[] args) {

        // To create a dynamic array containing Strings:
        ArrayList<String> programmingLanguages = new ArrayList<>();

        // The types used are from java.lang
        // int --> Integer
        // float --> Float
        // double --> Double

        // To add elements in the array:
        programmingLanguages.add("C#");
        programmingLanguages.add("Java");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");

        // to get the length of an ArrayList, use:
        System.out.println("Length: " + programmingLanguages.size());

        // to print out the array
        System.out.println("Show array: " + programmingLanguages);

        // to access a specific element in the array
        System.out.println(programmingLanguages.get(0));
        System.out.println(programmingLanguages.get(1));
        System.out.println(programmingLanguages.get(2));

        // to modify an entry
        programmingLanguages.set(0, "C");

        // to delete an entry using index
        programmingLanguages.remove(0);
        System.out.println(programmingLanguages);






    }


}
