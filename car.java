class Car {
    public String brand;
    public String model;
    public double speed;

    public void displayDetails() {
        System.out.println("Car: " + brand + " " + model + " | Current Speed: " + speed + " km/h");
    }

    public void accelerate(double increment) {
        speed = speed + increment;
        System.out.println(brand + " " + model + " accelerated. New Speed: " + speed + " km/h");
    }

    public void applyBrake(double decrement) {
        speed = speed - decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " " + model + " slowed down. New Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Corolla";
        c1.speed = 40.0;
        c1.displayDetails();
        c1.accelerate(25.0);
        c1.applyBrake(15.0);

        System.out.println();

        Car c2 = new Car();
        c2.brand = "Honda";
        c2.model = "Civic";
        c2.speed = 60.0;
        c2.displayDetails();
        c2.accelerate(20.0);
    }
}