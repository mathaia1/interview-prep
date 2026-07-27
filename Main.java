public class Main{
    public static void main (String[] args){

        GradeCalculator student1 = new GradeCalculator("John", 85, 90, 82);
        GradeCalculator student2 = new GradeCalculator("Sarah", 95, 92, 88);
        System.out.println(student1.studentName + ": Average " + student1.calculateAverage() + ", Grade " + student1.getGrade());
        System.out.println(student2.studentName + ": Average " + student2.calculateAverage() + ", Grade " + student2.getGrade());
        
    }
}