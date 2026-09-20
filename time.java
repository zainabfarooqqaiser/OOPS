class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public void displayTime() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }

    public void showTotalSeconds() {
        int total = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Total time in seconds: " + total);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.hours = 2;
        t1.minutes = 30;
        t1.seconds = 45;
        t1.displayTime();
        t1.showTotalSeconds();

        System.out.println();

        Time t2 = new Time();
        t2.hours = 0;
        t2.minutes = 15;
        t2.seconds = 20;
        t2.displayTime();
        t2.showTotalSeconds();
    }
}