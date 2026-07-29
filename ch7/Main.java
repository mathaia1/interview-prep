package ch7;

public class Main {
    public static void main (String [] args){
        UserAccount user1 = new UserAccount("john_doe", "pass123", 25);
        UserAccount user2 = new UserAccount("jane_smith", "securepass456", 16);
        UserAccount user3 = new UserAccount("bob_jones", "weak", 20);

        System.out.println("User 1 (age 25, 'pass123'):");
        System.out.println("  Strong password? " + user1.hasStrongPassword());
        System.out.println("  Legal age? " + user1.isLegalAge());
        System.out.println("  Can create account? " + user1.canCreateAccount());
        
        System.out.println("\nUser 2 (age 16, 'securepass456'):");
        System.out.println("  Strong password? " + user2.hasStrongPassword());
        System.out.println("  Legal age? " + user2.isLegalAge());
        System.out.println("  Can create account? " + user2.canCreateAccount());
        
        System.out.println("\nUser 3 (age 20, 'weak'):");
        System.out.println("  Strong password? " + user3.hasStrongPassword());
        System.out.println("  Legal age? " + user3.isLegalAge());
        System.out.println("  Can create account? " + user3.canCreateAccount());
        
        System.out.println("\nAuthentication:");
        System.out.println("  User 1 with 'pass123': " + user1.authenticate("pass123"));
        System.out.println("  User 1 with 'wrongpass': " + user1.authenticate("wrongpass"));
    }
}
