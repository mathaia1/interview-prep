package ch7;

public class StringPerformance{
    public static void main (String []args){
        int iterations = 10000;

        long start1 = System.currentTimeMillis();
        String str = "";
        for (int i =0; i<iterations; i++){
            str += "x";
        }

        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i<iterations; i++){
            buffer.append("x");
        }

        long end2 = System.currentTimeMillis();

        System.out.println("Using string += takes " + (end1 - start1) + " ms");
        System.out.println("Using StringBuffer takes " + (end2 - start2) + " ms");
        if ((end1-start1) >(end2-start2)){
            System.out.println("String buffer was " +((end1 - start1) - (end2 - start2)) + "ms faster.");
        }
    }
}