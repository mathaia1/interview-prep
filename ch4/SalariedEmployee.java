package ch4;
public class SalariedEmployee extends Employee {
    double salary;
    
    public SalariedEmployee(String s, int n, double salary){
        super(s,n);
        this.salary = salary;
    }

    @Override
    public double calculatePay(){
        return this.salary/12;
    }

}
