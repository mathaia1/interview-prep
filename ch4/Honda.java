package ch4;

public class Honda extends Car{ //Child class so extends
    public void assembleTyres(){
        System.out.println("Assembleed GoodYear tyres");
    }
    public void addCover(){
        System.out.println("Added Metallic Cover");
    }
    
    public void addEngine(){
        System.out.println("Add 500 HP Engine");
    }

    public void addSeats(){
        System.out.println("Add 2 Leather seats");
    }

    public void startCar(){
        System.out.println("Car started with AutoStart");
    }

    public void shiftGears(){
        System.out.println("Has Automatic Transmission");
    }

    public void drive(){
        System.out.println("Driving at 80 mi/hr");
    }
}
