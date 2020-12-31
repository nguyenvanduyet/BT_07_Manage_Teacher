public class Teacher extends Officers{
    private String name;
    private String birthDay;
    private String idTeacher;

    public Teacher(int hardSalary, int reward, int punish, String name, String birthDay, String idTeacher) {
        super(hardSalary, reward, punish);
        this.name = name;
        this.birthDay = birthDay;
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return super.toString()+name+birthDay+idTeacher;
    }
}
