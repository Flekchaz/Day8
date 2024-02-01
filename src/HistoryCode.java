import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class HistoryCode {

    public static void main(String[] args) {

        // Array Index Out of Bounds: Create an array of integers and try to access an
        // element at an index that is out of bounds. Use a try-catch block to handle
        // the ArrayIndexOutOfBoundsException and print a user-friendly message.

        try {
            int s[] = new int[9];
            s[22] = 8;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound: " + e);
        }

        ////////////////////////////////////////////////////////////////////////////////////
        // Number Format Exception: Prompt the user to enter a number as a string.
        // Use Integer.parseInt() to convert the string to an integer.
        // Handle the NumberFormatException if the input is not a valid integer.;
        ////////////////////////////////////////////////////////////////////////////////////
        try {
            String var1 = "AZE";
            int var2 = Integer.parseInt(var1);

            System.out.println(var2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Number format is not handled");
        }

        /////////////////////////////////////////////////////////////////////////////////////////////
        // File Not Found Exception: Write a program that attempts to read data from a file.
        // Handle the FileNotFoundException if the specified file does not exist.
        // You can use a try-catch block to handle the exception and inform the user.
        ///////////////////////////////////////////////////////////////////////////////////////////
        try {
            FileReader fileReader = new FileReader("Non_existing_file.txt");
        } catch (
                FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("File not found");

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////
        // Custom Exception: Create a custom exception class (e.g., CustomException) that extends Exception.
        // Use this custom exception to handle a specific condition in your program, such as input validation.
        ///////////////////////////////////////////////////////////////////////////////////////////////////

        try {
            int input = 5;

            if (input < 10) {

                throw new CustomException("Please input a valid number");

            } else {
                System.out.println("Valid input");
            }
        } catch (CustomException e) {
            System.out.println("Custom exception caught" + e.getMessage());
            ;
        }

        ////////////////////////////////////////////////////////////////////////////////////////////
        // NullPointerException: Create a program that uses an object reference without initializing it.
        // Handle the NullPointerException by checking if the reference is null before using it.
        ///////////////////////////////////////////////////////////////////////////////////////////////

        try {
            Integer ref = null;

            System.out.println(ref);
        } catch (NullPointerException e) {
            throw new NullPointerException("Null pointer exception caught: " + e.getMessage());
        }

        /////////////////////////////////////////////////////////////////////////////////////////////
        // User Input Validation: Write a program that asks the user to input a positive integer.
        // Use a loop to keep prompting the user until a valid input is provided,
        // and handle any exceptions that may occur during the input process.
        //////////////////////////////////////////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("Input a number");
                int inputNumber = scanner.nextInt();

                if (inputNumber>0) {
                    System.out.println("Positive number");
                    break;
                } else if (inputNumber <0){
                    System.out.println("Negative number");
                } else {
                    System.out.println("Number entered is zero");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid number, please input a positive one");
                scanner.nextLine();
            }

        }

        /////////////////////////////////////////////////////////////////////////////
        // Try-With-Resources: Create a program that reads data from a file using the
        // try-with-resources statement to automatically close the file.
        // Handle any exceptions that may occur during file I/O.
        /////////////////////////////////////////////////////////////////////////////

        String filePath = "C:\\Users\\Moad\\Downloads\\certificate-prepcamp-fs-java-angular-65994e5fb56bfba3df08352d.pdf";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            bufferedReader.lines().forEach(System.out::println);

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error reading the file");
        }

    }
}