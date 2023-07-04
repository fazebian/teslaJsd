import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeslaUserService userService = new TeslaUserServiceMock();
        List<TeslaUser> users = userService.getAdmissibleUsers();

        TestlaUserFilter userFilter = new TestlaUserFilter();
        List<TeslaUser> selectedUsers = userFilter.filterUsers(users, 25);

        System.out.println("Selected Users:");
        for (TeslaUser user : selectedUsers) {
            System.out.println(user.getEmail());
        }
    }
    }
