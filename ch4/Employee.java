package ch4;
public abstract class Employee {
    private    String name;
    private int id;
    final double MIN_WAGE = 7.25;

    public Employee(String s){
        this(s,0);
    }

    public Employee (String s, int n){
        this.name = s;
        this.id = n;
    }

    public abstract double calculatePay();

    public void printDetails(){
        System.out.println(this.name + this.calculatePay());
    }

    @Override
    public String toString(){
        return "ID: " + this.id;
    }

}
