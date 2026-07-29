package ch7;
public class UserAccount{
    private String username;
    private String password;
    private int age;

    public UserAccount(String username, String password, int age){
        this.username = username;
        this.password = password;
        this.age = age;
    }

    /**
    *Checks if the password is strong enough (> 8 chars)
    * @return true if password length is 8 or more, false otherwise
    */

    public boolean hasStrongPassword(){
        return password.length()>=8;
    }

    /**
     * checks if the user is of legal age(18+)
     * @return true if age is 18 or older, false otherwise
     */

    public boolean isLegalAge(){
        return age>=18;
    }

        /**
         * Checks if the account can be created
         * An account is valid if the user is legal age and has strong pass
         * @return true if account meets all requirements, false otherwise
         */
    
        public boolean canCreateAccount(){
            return isLegalAge() && hasStrongPassword();
        }
    
        /**
         * Authenticates the suer with a provided password.
         * @param attemtptedPassword the password to verify
         * @return true if pass matches
        */
        public boolean authenticate(String attemptedPassword){
            return attemptedPassword.equals(password);
        }
}