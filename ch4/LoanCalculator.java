package ch4;
public class LoanCalculator {
    //Class taking the details and returns essentials
    static int creditScore;
    static double annualIncome;
    static double approvedAmount;

    static void setCreditScore(int score){
        //Storing creditscore to this class (treat it as its own object)
        creditScore = score;
    }

    static void setAnnualIncome (double income){
        annualIncome = income;
    }

    static double getApprovedAmount(){
        if (creditScore<600 && annualIncome < 60000){
            approvedAmount = 500;
        }
        else if (creditScore > 600 && annualIncome < 70000){
            approvedAmount = 1000;
        }
        else{
            approvedAmount = 0.0;
        }

        return approvedAmount;
    }
}
