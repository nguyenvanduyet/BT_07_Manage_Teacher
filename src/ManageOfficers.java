import java.util.ArrayList;

public class ManageOfficers {
    ArrayList<Officers>list=new ArrayList();
    public void addOfficers(Officers officers){
        list.add(officers);
    }
    public void displayAll(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public void tesSalaryMoreThan8M(){
        boolean realField = true;
        for (int i = 0; i <list.size() ; i++) {
            realField = list.get(i).getRealField() >=8;
            if (realField){
                System.out.println(list.get(i));
            }
        }
        if (!realField){
            System.out.println("không có cán bộ nào lương cao hơn 8 triệu");
        }
        return;

    }
}
