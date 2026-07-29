package ch6;
public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message); //Creating child class of Exception to write custom exception and takes string arg as a messaage to user, calls constructor from Exception class
    }
}