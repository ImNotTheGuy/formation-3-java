package courseDay6.course.part3StaticMethod;

public class Validator {

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static int max(int a, int b){
        if (a==b){
            return 0;
        }
        return a>b?a:b;
    }
}