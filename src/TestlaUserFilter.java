import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestlaUserFilter {
    public List<TeslaUser> filterUsers(List<TeslaUser>users, int percent){

        List<TeslaUser> eligiblesUsers = new ArrayList<>();
        for (TeslaUser user : users){
            if(user.isEnregisterUS() && user.isPayement() && user.getScoreConduite() > 99){
                eligiblesUsers.add(user);
            }

        }
        int nombreDeUserASelectionner = (int)Math.ceil(eligiblesUsers.size() * percent /100.0);
        eligiblesUsers.sort(Comparator.comparing(TeslaUser::getEmail));

        List<TeslaUser> selectedUsers = new ArrayList<>();
        for (int i =0;i<nombreDeUserASelectionner;i++){
            selectedUsers.add(eligiblesUsers.get(i));
        }

        return selectedUsers.subList(0,nombreDeUserASelectionner);
    }
}
