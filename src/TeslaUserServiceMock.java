import java.util.ArrayList;
import java.util.List;

public class TeslaUserServiceMock implements TeslaUserService{
    @Override
    public List<TeslaUser> getAdmissibleUsers() {
        List<TeslaUser> users = new ArrayList<>();
        users.add(new TeslaUser("user20@tesla.com",true , 100, true));
        users.add(new TeslaUser("puser@tesla.com", true , 100, true));
        users.add(new TeslaUser("user3@tesla.com", true , 99, true));
        users.add(new TeslaUser("user4@tesla.com", true , 100, true));
        users.add(new TeslaUser("user5@tesla.com", true , 100, true));
        users.add(new TeslaUser("user6@tesla.com", true , 100, true));
        users.add(new TeslaUser("user7@tesla.com", true , 100, true));
        users.add(new TeslaUser("user8@tesla.com", true , 100, true));
        users.add(new TeslaUser("user9@tesla.com", true , 100, true));
        users.add(new TeslaUser("user90@tesla.com", true , 100, true));
        return users;
    }
}
