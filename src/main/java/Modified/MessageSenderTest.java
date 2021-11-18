package Modified;

import Meta.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MessageSenderTest {
    MessageSender sender;
    FacebookUser facebookUser;
    ModifiedFacebookUser modifiedFacebookUser;
    Date date;

    @BeforeEach
    void setUp() {
        FacebookUser newFacebookUser = new FacebookUser("someone@ucu.edu.ua", "Austria", date);
        modifiedFacebookUser = new ModifiedFacebookUser(newFacebookUser);
        sender = new MessageSender();
    }

    @Test
    void send() {
        assertTrue(sender.send("sent", modifiedFacebookUser, "Austria").equals("sent"));
    }

}