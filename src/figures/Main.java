package figures;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        figures[0] = new Rectangle();
        figures[1] = new Triangle();
        figures[2] = new Circle();
        figures[3] = new Rectangle();
        figures[4] = new Triangle();
        figures[5] = new Circle();
        double sumOfPerimeters = 0;
        for (Figure f : figures) {
            System.out.println(f.toString());
            f.area();
            sumOfPerimeters += f.perimeter();
            System.out.println();
        }
        System.out.printf("The sum of perimeters all figures = %f", sumOfPerimeters);
    }
}
