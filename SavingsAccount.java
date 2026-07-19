public class SavingsAccount extends BankAccount{

    private double minimumBalance;

    public SavingsAccount (double b, double minimumBalance){ 
        //Constructor for Savings account class
        super(b); //Calls constructor for BankAccount as it is not inherited
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean withdraw (double amount){
        if ((this.getBalance() - amount) >= minimumBalance){
            return super.withdraw(amount); //call on parents version of withdraw and returns boolean from that
        }
        else{
            return false;
        }
    }
}