package ch4;


public class Main{
    public static void main (String[] args){

       Employee[] payroll = {new SalariedEmployee("Hemru",12345,150000),new SalariedEmployee("Bob",15,15000), new HourlyEmployee("Jeff", 1234, 12, 15)};
        
    for (int i = 0; i<3; i++){
        System.out.println(payroll[i].printDetails());
    }
    }
}