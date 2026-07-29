package ch6;
public class Main {
    public static void main(String[] args) {
        MovieTicket movie1 = new MovieTicket("The Conjuring", "R");
        MovieTicket movie2 = new MovieTicket("Inside Out 2", "PG-13");
        
        // Person 1: too young for R-rated
        System.out.println("=== Customer 1 (age 15) ===");
        try {
            movie1.purchaseTicket(15);
        }
        catch (InvalidAgeException e) {
            System.out.println("❌ " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for visiting!");
        }
        
        // Person 2: old enough for PG-13
        System.out.println("\n=== Customer 2 (age 14) ===");
        try {
            movie2.purchaseTicket(14);
        }
        catch (InvalidAgeException e) {
            System.out.println("❌ " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for visiting!");
        }
        
        // Person 3: old enough for R-rated
        System.out.println("\n=== Customer 3 (age 18) ===");
        try {
            movie1.purchaseTicket(18);
        }
        catch (InvalidAgeException e) {
            System.out.println("❌ " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for visiting!");
        }
    }
}