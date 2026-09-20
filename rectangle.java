class Rectangle {
    public double length;
    public double width;

    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area (Length: " + length + ", Width: " + width + ") = " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10.5;
        r1.width = 5.0;
        r1.calculateArea();
        r1.calculatePerimeter();

        System.out.println();

        Rectangle r2 = new Rectangle();
        r2.length = 4.0;
        r2.width = 3.0;
        r2.calculateArea();
        r2.calculatePerimeter();
    }
}