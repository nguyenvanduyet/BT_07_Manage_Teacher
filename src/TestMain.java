import java.util.Scanner;

public class TestMain {
    static Scanner sc = new Scanner(System.in);
    static ManageOfficers manageOfficers = new ManageOfficers();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. nhập cán bộ");
            System.out.println("2. hiện thị danh sách cán bộ");
            System.out.println("3. hiện thị danh sách cán bộ có lương >= 8 triệu");
            System.out.println("0. thoát chương trình");
            System.out.println("nhập biến choice");
            choice=Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng cán bộ");
                    int number=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewOfficers();
                    }
                    break;
                case 2:
                    manageOfficers.displayAll();
                    break;
                case 3:
                    manageOfficers.tesSalaryMoreThan8M();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
    public static void addNewOfficers(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("nhập lương cứng");
        int hardSalary=Integer.parseInt(sc.nextLine());
        System.out.println("nhập thưởng");
        int reward=Integer.parseInt(sc1.nextLine());
        System.out.println("nhập phạt");
        int punish=Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên cán bộ");
        String name=sc1.nextLine();
        System.out.println("nhập ngày sinh");
        String birthDay=sc.nextLine();
        System.out.println("nhập địa chỉ");
        String idTeacher=sc1.nextLine();
        Teacher teacher=new Teacher(hardSalary,reward,punish,name,birthDay,idTeacher);
        manageOfficers.addOfficers(teacher);
    }
}
