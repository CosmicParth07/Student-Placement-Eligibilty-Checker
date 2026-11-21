
public class Student {

    private int studentId;
    private String name;
    private double cgpa;
    private double tenthPercentage;
    private double twelfthPercentage;
    private int backlogs;

    public Student(int studentId, String name,
                   double cgpa, double tenthPercentage,
                   double twelfthPercentage, int backlogs) {

        this.studentId = studentId;
        this.name = name;
        this.cgpa = cgpa;
        this.tenthPercentage = tenthPercentage;
        this.twelfthPercentage = twelfthPercentage;
        this.backlogs = backlogs;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public double getTenthPercentage() {
        return tenthPercentage;
    }

    public double getTwelfthPercentage() {
        return twelfthPercentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public void displayDetails() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("10th Percentage: " + tenthPercentage);
        System.out.println("12th Percentage: " + twelfthPercentage);
        System.out.println("Backlogs: " + backlogs);
    }
}
