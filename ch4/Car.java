package ch4;

public abstract class Car { //lots of abstract methods
    public abstract void assembleTyres();
    public abstract void addCover();
    public abstract void addEngine();
    public abstract void addSeats();
    public abstract void startCar();
    public abstract void shiftGears();
    public abstract void drive();

    public void testdrive(){ //One defined method, child class always expected to use
        assembleTyres();
        addCover();
        addEngine();
        addSeats();
        startCar();
        shiftGears();
        drive();
    }
}
