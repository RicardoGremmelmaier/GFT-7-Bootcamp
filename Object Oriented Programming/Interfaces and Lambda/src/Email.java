public class Email implements MessageApps {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }

    @Override
    public String receiveMessage(String message) {
        return "Email received: " + message;
    }

}
