class Distance {
    public int feet;
    public double inches;


    public Distance() {
        feet = 0;
        inches = 0.0;
    }


    public Distance(int f, double in) {
        feet = f;
        inches = in;
    }

    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.display();

        Distance d2 = new Distance(5, 8.5);
        d2.display();
    }
}