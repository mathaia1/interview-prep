package ch5;

public class Triangle extends Shape {
    private double base;
    private double height;

    public double getArea(){
        return (0.5 * this.base * this.height);
    }
}
