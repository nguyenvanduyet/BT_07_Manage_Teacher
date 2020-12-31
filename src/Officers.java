public class Officers {
    private int hardSalary;
    private int reward;
    private int punish;

    public Officers(int hardSalary, int reward, int punish) {
        this.hardSalary = hardSalary;
        this.reward = reward;
        this.punish = punish;
    }

    public int getRealField() {
        return (hardSalary+reward-punish);
    }


    @Override
    public String toString() {
        return "Officers{" +
                "hardSalary=" + hardSalary +
                ", reward=" + reward +
                ", punish=" + punish + ",real field"+getRealField()+
                '}';
    }
}
