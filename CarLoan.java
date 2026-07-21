public class CarLoan implements Payable{
    private double loanAmount;
    private int months;

    public CarLoan (double L, int m){
        this.loanAmount = L;
        this.months = m;
    }

    @Override
    public double getMonthlyPayment(){
        return (double) (loanAmount/months);
    }
}