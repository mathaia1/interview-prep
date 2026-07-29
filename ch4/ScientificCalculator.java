package ch4;

public class ScientificCalculator extends BasicCalculator{
    private double result;

    public double multiply (double n, double m){
        result = n*m;
        return result;
    }
}
