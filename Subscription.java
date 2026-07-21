public class Subscription implements Payable {
    private double monthlyFee;

    public Subscription(double mF){
        this.monthlyFee = mF;
    }

    @Override
    public double getMonthlyPayment(){
        return this.monthlyFee;
    }
    
}
