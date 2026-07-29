package ch4;
public class StaticBlockDemo {
   static{
    System.out.println("Class is 40% initalized");
   } 

   static{
    System.out.println("Reminaing 60% Class is initalized");

   }

   public static void main (String args[]){
    System.out.println("I am in main");
   }
}
