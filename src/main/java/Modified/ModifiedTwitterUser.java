package Modified;

import Twitter.TwitterUser;
import lombok.AllArgsConstructor;

import java.util.Date;
@AllArgsConstructor
public class ModifiedTwitterUser implements User{
    private TwitterUser twitterUser;

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public Date getLastTime() {
        return twitterUser.getLastActiveTime();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }
}
