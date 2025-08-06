public class SocialMedia implements MessageApps {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Social Media Message: " + message);
    }

    @Override
    public String receiveMessage(String message) {
        return "Received Social Media Message: " + message;
    }

}
