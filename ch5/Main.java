package ch5;

public class Main { 
    public static void main (String [] args){
    Shape[] shapes = {new Circle(),new Triangle(), new Rectangle()};

    for (int i = 0; i<3; i++){
        shapes[i].display();
    }

    Shape a = new Circle();
    a.getArea();
}
}
