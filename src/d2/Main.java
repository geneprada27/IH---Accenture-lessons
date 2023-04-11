package d2;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      ARRAYS

    String[] days = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        System.out.println(days[2]);

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[2]);
        System.out.println(subjectsArray.length);


 //     FOR LOOP
        for(int i = 0; i < subjectsArray.length; i++) {
//            if (subjectsArray[i].equals("Lengua")) continue;
            System.out.println(subjectsArray[i]);
//            if (subjectsArray[i].equals("Biología")) break;
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i<= 100; i++){
            if (i % 2 == 0) {
                evenNumbers[j] = i;
                j++;
            }
        }

        System.out.println(evenNumbers.length);
        System.out.println(Arrays.toString(evenNumbers));

//      FOREACH LOOP

        for (int number : evenNumbers){
            System.out.print(number + ", ");
        }
        System.out.println();

        for (String subject : subjectsArray){
            System.out.println(subject);
        }

//      WHILE
        int counter = 0;
        while (counter < evenNumbers.length){
            counter++;
        }

        System.out.println("counter:" + counter);

//      DO WHILE LOOP
        counter = 100;
        do{
            counter++;
        } while(counter < evenNumbers.length);
        System.out.println("counter: "+ counter);

//      MATH CLASS & CASTING

        System.out.println(Math.sqrt(100));
        System.out.println((int)Math.pow(2, 5));

//      ARRAYLIST

        List<String> countries = new ArrayList<>();
        countries.add("España");
        countries.add("Portugal");
        countries.add("Francia");
        System.out.println(countries);
        System.out.println(countries.get(0));
        countries.set(0, "Italia");
        System.out.println(countries.get(0));
        System.out.println(countries.size());
        countries.remove( 0 );
        System.out.println(countries.size());

        for (int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }


    }

    public static String[] createSubjectsArray(){
        String[] subjects = new String[5];
        subjects[0] = "Matemáticas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Biología";
        subjects[4] = "Química";

        return subjects;
    }
}
