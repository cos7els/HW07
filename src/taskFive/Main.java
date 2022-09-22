package taskFive;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Sasha", "Pupkin", "X14", 4.9);
        students[1] = new Student("Dima", "Pupkin", "X15", 5);
        students[2] = new Aspirant("Lesha", "Pupkin", "X16", 4.9);
        students[3] = new Aspirant("Petia", "Pupkin", "X17", 5);
        for (Student s : students) {
            System.out.printf("%s %s %s, group %s, AVG mark = %f, scholarship = %d.\n",
                    s.getClass().getSimpleName(), s.getFirstName(), s.getLastName(), s.getGroup(), s.getAverageMark(),
                    s.getScholarship());
        }
    }
}
