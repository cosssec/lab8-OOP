package Twitter;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class TwitterUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;

    public TwitterUser(String userMail, String country, Date date) {
    }
}
