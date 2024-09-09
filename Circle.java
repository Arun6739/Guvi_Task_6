package task_6;

public class Circle {

    private double radius;

    public Circle() {
        this.radius = 3.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Circle with default radius (" + c.getRadius() + "):");
        System.out.println("Circumference: " + c.getCircumference());

        Circle c1 = new Circle(7.0);
        System.out.println("\nCircle with radius 7.0:");
        System.out.println("Circumference: " + c1.getCircumference());
    }
}
