package ch6;

public class RuntimeExceptionDemo {
    public static void main (String[] args){
        try {
            int result = 10/0; //Arrithmetic Exception

            int []arr = {1,2};
            int num = arr[5]; //Array out of bounds exception
        }

        catch (ArithmeticException e){
            System.out.println("Cannot divide bye zero!");
        }

        catch (ArrayIndexOutOfBoundsException e){ //e is the object that holds the exception that is produced by the failed code
            //when the catch sees that exception it print out the statement determined by the user
            System.out.println("Array index out of bounds!");
        }
    }
}
