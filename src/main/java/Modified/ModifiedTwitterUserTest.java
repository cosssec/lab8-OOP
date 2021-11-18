package Modified;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Twitter.TwitterUser;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedTwitterUserTest {
    private TwitterUser twitterUser;
    private ModifiedTwitterUser modifiedTwitterUser;
    private Date date;

    @BeforeEach
    void setUp() {
        date = new Date();
        twitterUser = new TwitterUser("privet@hello", "Lutsk", date);
        modifiedTwitterUser = new ModifiedTwitterUser(twitterUser);
    }
    @Test
    void getCountry() {
        assertEquals(twitterUser.getCountry(), modifiedTwitterUser.getCountry());
    }

    @Test
    void getDate() {
        assertEquals(twitterUser.getLastActiveTime(), modifiedTwitterUser.getLastTime());
    }
    @Test
    void getEmail() {
        assertEquals(twitterUser.getUserMail(), modifiedTwitterUser.getEmail());
    }

}