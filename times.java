class Times {
    public int hr;
    public int min;
    public int sec;


    public Times() {
        hr = 0;
        min = 0;
        sec = 0;
    }


    public Times(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            hr = h;
        } else {
            hr = 0;
        }

        if (m >= 0 && m < 60) {
            min = m;
        } else {
            min = 0;
        }

        if (s >= 0 && s < 60) {
            sec = s;
        } else {
            sec = 0;
        }
    }

    public void display() {
        System.out.println("Time: " + hr + " hr : " + min + " min : " + sec + " sec");
    }

    public static void main(String[] args) {
        Times t1 = new Times();
        t1.display();


        Times t2 = new Times(14, 45, 30);
        t2.display();


        Times t3 = new Times(25, 65, -10);
        t3.display();
    }
}