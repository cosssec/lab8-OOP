package Modified;

public class MessageSender {
    public String send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            return "sent";
        }
        else {
            return "error";
        }
    }
}
