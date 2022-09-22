package figures;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = Math.random() * 100;
        this.b = Math.random() * 100;
        this.c = Math.random() * 100;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double area = Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
        System.out.printf("The area of triangle = %f\n", area);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = a + b + c;
        System.out.printf("The perimeter of triangle = %f\n", perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "A = " + a +
                ", B = " + b +
                ", C = " + c;
    }
}
