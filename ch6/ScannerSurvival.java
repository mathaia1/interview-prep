package ch6;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerSurvival {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int num = -1;
        boolean valid = false;

        while (!valid){
            try{
                System.out.print("Enter an integer");
                num = scan.nextInt();
                valid = true; //Only reached if nextInt() succeeds
            }

            catch (InputMismatchException e){
                System.out.println("Invalid input! Please enter a number");
                scan.nextLine();
            }
        }

        System.out.println("Because you entered " + num + " you escaped the loop");
    }
}
