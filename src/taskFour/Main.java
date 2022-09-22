package taskFour;

public class Main {
    public static void main(String[] args) {
        recursion(1, 10);
        recursion(111, 101);

    }

    public static int recursion(int a, int b) {
//        System.out.println(a == b ? b : a < b ? recursion(a, b - 1) : recursion(a, b + 1));
        if (a == b) {
            return b;
        }
        System.out.println(recursion(a, a < b ? b - 1 : b + 1));
        return b;
    }
}
