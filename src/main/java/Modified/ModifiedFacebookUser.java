package Modified;

import Meta.FacebookUser;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class ModifiedFacebookUser implements Modified.User {
    private FacebookUser facebookUser;

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public Date getLastTime() {
        return facebookUser.getUserActiveTime();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

}
