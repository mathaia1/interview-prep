package ch5;


public class Circle extends Shape {
    private double radius;

    @Override
    public double getArea(){
        return (Math.PI * (this.radius * this.radius));

    }

    
}
