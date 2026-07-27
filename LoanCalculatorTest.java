public class LoanCalculatorTest {
    public static void main (String args []){
        //Passing details into LoanCalculator class
        LoanCalculator.setCreditScore(650);
        LoanCalculator.setAnnualIncome(55000.00);
        //Get Results
        double amount = LoanCalculator.getApprovedAmount();

        System.out.println("Approved Amount = $" + amount);
    }
}
