package figures;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle() {
        this.height = Math.random() * 100;
        this.width = Math.random() * 100;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        double area = this.height * this.width;
        System.out.printf("The area of rectangle = %f\n", area);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = this.height + this.width;
        System.out.printf("The perimeter of rectangle = %f\n", perimeter);
        return perimeter;
    }

    public String toString() {
        return "Rectangle: " +
                "height = " + this.height +
                ", width = " + this.width;
    }
}
