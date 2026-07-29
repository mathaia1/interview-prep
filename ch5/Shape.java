package ch5;

public abstract class Shape {
    private String color;

    public abstract double getArea();

    public void display(){
        System.out.println(this.color + " " + this.getArea());
    }
    
}
