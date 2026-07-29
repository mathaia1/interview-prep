package ch4;

public class CalculatorInheritenceTest {
    public static void main (String args []){
         //Client 1
         BasicCalculator bc = new BasicCalculator();
         double result = bc.sum(10,20);

         //Client 2
         ScientificCalculator sc = new ScientificCalculator();
         result = sc.sum(20,30);
         result = sc.multiply(20,30);
    }
}
