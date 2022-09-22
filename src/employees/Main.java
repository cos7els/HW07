package employees;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Director();
        employees[1] = new Worker();
        employees[2] = new Accountant();
        for (Employee e : employees) {
            e.print();
        }
    }
}
