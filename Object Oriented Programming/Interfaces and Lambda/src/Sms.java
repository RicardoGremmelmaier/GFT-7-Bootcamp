public class Sms implements MessageApps {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }

    @Override
    public String receiveMessage(String message) {
        return "Received SMS: " + message;
    }

}
