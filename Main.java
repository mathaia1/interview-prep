public class Main{
    public static void main (String[] args){
        BankAccount acct = new SavingsAccount(100,25);
        System.out.println("Withdraw 90 succeeded?" + acct.withdraw(90)); //Won,t succeed as min balance is 25
        System.out.println("Balance: " + acct.getBalance()); //100
        System.out.println("Withdraw 50 succeeded?" + acct.withdraw(50)); //Yes
        System.out.println("Balance: " + acct.getBalance()); // 50
    }
}