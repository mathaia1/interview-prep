package ch4;
public class SumSquare{
    public static void main (String args []){
        long sum = 0;
        for (int i =1; i<=30; i++){
            sum = sum + i*i;
        }

        System.out.println("The sum of squares of first 30 numbers is " + sum);

    }
}