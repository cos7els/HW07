package employees;

public abstract class Employee implements Printable {
    private String jobPosition;

    public Employee(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Override
    public void print() {
        System.out.println(this.jobPosition);
    }
}
