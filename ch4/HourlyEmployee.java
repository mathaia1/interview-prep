package ch4;
public class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(String n, int ID, int rate, int hours){
        super(n,ID);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    public double calculatePay(){
        if (hourlyRate >= MIN_WAGE){
            return this.hourlyRate * this.hoursWorked;
            }
        else{
            return 0.0;
        }
    }
}
