package taskFive;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        return this.getAverageMark() >= 5 ? 200 : 180;
    }
}
