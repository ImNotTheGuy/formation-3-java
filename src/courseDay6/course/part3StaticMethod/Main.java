package courseDay6.course.part3StaticMethod;

public class Main {

    public static void main(String[] args) {

        String dbURL = Configuration.DATABASE_URL;
        String dbUsr = Configuration.DATABASE_USER;
        String dbPwd = Configuration.DATABASE_PASSWORD;

        System.out.printf("Database URL %s\n", dbURL);
        System.out.printf("Database User %s\n", dbUsr);
        System.out.printf("Database Password %s\n", dbPwd);

        System.out.println(Validator.isValidEmail("@gmail.com"));
        System.out.println(Validator.max(1,2));

    }
}
