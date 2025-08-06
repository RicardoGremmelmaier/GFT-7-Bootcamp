public class WhatsApp implements MessageApps {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp message: " + message);
    }

    @Override
    public String receiveMessage(String message) {
        return "WhatsApp message received: " + message;
    }

}
