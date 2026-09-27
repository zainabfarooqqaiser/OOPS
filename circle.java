class Circle {
    public double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r, double defaultRadius) {
        if (r > 0) {
            radius = r;
        } else {
            radius = defaultRadius;
        }
    }

    public double calculateCircumference() {
        return 2 * 3.14159 * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius + "  Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

        Circle c2 = new Circle(5.5, 1.0);
        c2.display();
    }
}