import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        /////////////////////////////////////////////////////////////////////////////////////////
        // Write a program that performs some operations (e.g., division, array access)
        // where multiple types of exceptions can occur. Use multiple catch blocks to
        // handle each type of exception separately.
        //////////////////////////////////////////////////////////////////////////////////////////

        int [] arrayOf = new int [8];
        arrayOf[10]=15;

        try {
            System.out.println(arrayOf);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());;
        }

    }
}
