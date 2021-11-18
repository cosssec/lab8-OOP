package Meta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @AllArgsConstructor
public class FacebookUser {
    private String Email;
    private String UserCountry;
    private Date UserActiveTime;

}
