public class Main {
    public static void main(String[] args) throws Exception {
        
        MessageApps sms = new Sms();
        sms.sendMessage("Hello via SMS");
        System.out.println(sms.receiveMessage("Hello via SMS"));

        MessageApps email = new Email();
        email.sendMessage("Hello via Email");
        System.out.println(email.receiveMessage("Hello via Email"));

        MessageApps whatsapp = new WhatsApp();
        whatsapp.sendMessage("Hello via WhatsApp");
        System.out.println(whatsapp.receiveMessage("Hello via WhatsApp"));

        MessageApps socialMedia = new SocialMedia();
        socialMedia.sendMessage("Hello via Social Media");
        System.out.println(socialMedia.receiveMessage("Hello via Social Media"));
    }
}
