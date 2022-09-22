package figures;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        this.radius = Math.random() * 100;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(this.radius, 2);
        System.out.printf("The area of circle = %f\n", area);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = Math.PI * 2 * this.radius;
        System.out.printf("The perimeter of circle = %f\n", perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius = " + radius;
    }
}
