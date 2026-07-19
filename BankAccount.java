public class BankAccount{
    //Instance variables
    private double balance;

    //Constructor
    public BankAccount(double b){
        this.balance = b;
    }

    public void deposit (double amount){
        if (amount>=0){
            this.balance +=amount;
        }
    }

    public boolean withdraw (double amount){
        if (amount>balance){
            return false;
        }
        else{
            this.balance -=amount;
            return true;
        }
    }

    public double getBalance(){
        return balance;
    }

}

