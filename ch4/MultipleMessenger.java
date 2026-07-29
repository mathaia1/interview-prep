package ch4;

public class MultipleMessenger {
    //One messge
    public void sendMessage(String msg1){
        System.out.println(msg1 + " sent to mainframe");
    }

    public void sendMessage (String msg1, String msg2){
        System.out.println(msg1 + msg2 + "sent to mainframe");
    }

    public void sendMessage(String msg1, String msg2, String msg3){
        System.out.println(msg1 + msg2 + msg2 + " sent to mainframe");
    }
}
