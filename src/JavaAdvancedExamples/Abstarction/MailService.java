package JavaAdvancedExamples.Abstarction;

public class MailService {

    public void sendMail(String text){
        connect();
        authenticate();
        //Send mail
        System.out.println("Mail sent!\n" + text);
        disconnect();
    }

    private void connect(){
        System.out.println("Connected to server!");
    }

    private void authenticate(){
        System.out.println("Authenticated!");
    }

    private void disconnect(){
        System.out.println("Disconnected!");
    }
}
