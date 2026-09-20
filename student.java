class Student {
    public String studentId;
    public String name;
    public String degreeProgram;
    public double cgpa;

    public void displayInfo() {
        System.out.println("ID: " + studentId + " | Name: " + name +
                " | Program: " + degreeProgram + " | CGPA: " + cgpa);
    }

    public void updateCgpa(double newCgpa) {
        cgpa = newCgpa;
        System.out.println("Updated CGPA for " + name + " is: " + cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "SE-101";
        s1.name = "zainab";
        s1.degreeProgram = "Software Engineering";
        s1.cgpa = 3.4;
        s1.displayInfo();
        s1.updateCgpa(3.6);

        System.out.println();

        Student s2 = new Student();
        s2.studentId = "CS-102";
        s2.name = "Ayesha";
        s2.degreeProgram = "Computer Science";
        s2.cgpa = 3.8;
        s2.displayInfo();
    }
}