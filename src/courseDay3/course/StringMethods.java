package courseDay3.course;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Jackthecat";

        // charAt(i) method returns the character at position i
        System.out.println(name.charAt(1)); // --> 'a';

        // loop through a string, char by char:
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // indexOf('') returns the first occurrence of a character in a given string
        // if no element can be found, returns -1;
        // if there are multiple chars in the same string, use the second argument in the
        // method which specifies from where to start in the String.

        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('z'));
        System.out.println(name.indexOf('a', 3));

        // Replace caracters with method replace()
        // note that if you need to specify if the variable changes or not
        // str = str.replace('a', 'b') changes the original
        // str.replace('a', 'b') does not change the original
        String otherName = "blabladodo";
        System.out.println(otherName.replace('a', 'o'));
        System.out.println(otherName);

        // substring(i, j) is used to get part of the string from char at index i to index j.

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(alphabet.substring(0,4));

    }
}
