package ch4;

public class MultipleMessengerTest {
    public static void main(String args []){
        MultipleMessenger messenger = new MultipleMessenger();
        messenger.sendMessage("Hello ");
        messenger.sendMessage("Hello ", " World");
        messenger.sendMessage("Hello ","Beautifil", "World");
    }
}
