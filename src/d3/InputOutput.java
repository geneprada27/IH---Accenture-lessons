package d3;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class InputOutput {

    public static void main(String[] args) throws IOException {
 //     INPUT / OUTPUT

//       System.out.println("Prueba de salida normal por consola");
//        System.err.println("Prueba de salida de error por consola");

//        Scanner scanner = new Scanner(System.in); /*CREA OBJETO DE UNA CLASE -NEW-*/

//        String name;
//        do {
//            System.out.println("Please write your name");
//            name = scanner.nextLine(); /*ASÍ GANAMOS ACCESO A LO QUE ESCRIBA EL USUARIO Y GUARDAMOS ESE DATO*/
//        } while (name.length() < 3);
//        System.out.println("Your name is: " + name);

//        System.out.println("Please, write your age");
//        int age = scanner.nextInt();
//        System.out.println("Your age is: " + age);

//        scanner.close();

//      FILE HANDLING
//CÓMO CREAR UN FICHERO

        String filePath = "src/d3/fichero.txt";

        File file = new File (filePath);
        if(file.createNewFile()){
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya existía");
        }
//CÓMO ESCRIBIR EN EL FICHERO
        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write("Esto es una línea\n");
        fileWriter.write("Esto es otra línea\n");
        fileWriter.close();

//LEER INFO DEL FICHERO

        Scanner fileScanner = new Scanner(file);
        String str = "";
        while(fileScanner.hasNextLine()) {
            str += fileScanner.nextLine() + "\n";
            System.out.println(str);
        }

        fileScanner.close();
    }
}
