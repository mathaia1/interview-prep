package ch5;

public class Rectangle extends Shape{
    private double width;
    private double height;


    public double getArea(){
        return (this.width * this.height);
    }
}