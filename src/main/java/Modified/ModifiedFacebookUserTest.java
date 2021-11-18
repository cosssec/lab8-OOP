package Modified;

import Meta.FacebookUser;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModifiedFacebookUserTest {
    private FacebookUser facebookuser;
    private ModifiedFacebookUser modifiedFacebookUser;
    private Date date;

    @BeforeEach
    void setUp() {
        date = new Date();
        facebookuser = new FacebookUser("hello@gmail.com", "Ukraine", date);
        modifiedFacebookUser = new ModifiedFacebookUser(facebookuser);
    }

    @Test
    void getDate() {
        assertEquals(facebookuser.getUserActiveTime(), modifiedFacebookUser.getLastTime());
    }

    @Test
    void getEmail() {
        assertEquals(facebookuser.getEmail(), modifiedFacebookUser.getEmail());
    }

    @Test
    void getCountry() {
        assertEquals(facebookuser.getUserCountry(), modifiedFacebookUser.getCountry());
    }


}