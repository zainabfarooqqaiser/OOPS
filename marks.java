class Marks {
    public double mark1;
    public double mark2;
    public double mark3;


    public Marks() {
        mark1 = 0.0;
        mark2 = 0.0;
        mark3 = 0.0;
    }

    public Marks(double m1, double m2, double m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    public Marks(double m1, double m2) {
        mark1 = m1;
        mark2 = m2;
        mark3 = 0.0;
    }

    public double calculateSum() {
        return mark1 + mark2 + mark3;
    }

    public void display() {
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3 + " | Total Sum: " + calculateSum());
    }

    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.display();

        Marks m2 = new Marks(85.5, 90.0, 78.0);
        m2.display();
    }
}