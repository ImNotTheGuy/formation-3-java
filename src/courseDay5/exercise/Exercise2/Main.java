package courseDay5.exercise.Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient(60, 2.3, 19);
        Patient patient2 = new Patient("John", "Doe", 15, 85., 1.8); // invalid age
        Patient patient3 = new Patient("John", "Doe", 18, 85., 1.8); // valid age

        ArrayList<Patient> patientArrayList = new ArrayList<>();

        patientArrayList.add(patient1);
        patientArrayList.add(patient2);
        patientArrayList.add(patient3);


        for (Patient patient:patientArrayList) {
            patient.toString();
        }

        System.out.println("\nPatient 1\n");

        patient1.toString();

        System.out.println("\nPatient 2\n");

        patient2.toString();

        System.out.println("\nPatient 3\n");

        System.out.println(patient3.toString());

        System.out.println("\nShow stuff\n");

        System.out.println(patient1);

        try {
            System.out.println("Trying 1 / 0");
            int a = 1/0;
        } catch (Exception e){
            System.out.println("Caught exception: " + e);
        }
        System.out.println("code continues to run");
    }
}
