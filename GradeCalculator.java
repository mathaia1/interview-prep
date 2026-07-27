public class GradeCalculator{
    String studentName;
    int assignment1;
    int assignment2;
    int assignment3;

    public GradeCalculator(String s, int a1, int a2, int a3){
        this.studentName = s;
        this.assignment1 = a1;
        this.assignment2 = a2;
        this.assignment3 = a3;
    }

    public double calculateAverage(){
        double sum = (double) (this.assignment1 + this.assignment2 + this.assignment3);
        return (sum/3.0);
    }

    public char getGrade(){
        double avg = this.calculateAverage();
        if (avg >= 90.0){
            return ('A');
        }
        else if (avg >= 80.0){
            return('B');
        }
        else if (avg >= 70.0){
            return ('C');
        }
        else if (avg >= 60.0){
            return ('D');
        }
        else{
            return ('F');
        }
    }

}