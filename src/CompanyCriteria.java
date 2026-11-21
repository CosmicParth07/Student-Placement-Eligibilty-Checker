
public class CompanyCriteria extends PlacementCriteria {

    public CompanyCriteria(String companyName,
                           double cgpa,
                           double tenth,
                           double twelfth,
                           int backlogs) {

        this.companyName = companyName;
        this.minimumCgpa = cgpa;
        this.minimumTenth = tenth;
        this.minimumTwelfth = twelfth;
        this.maximumBacklogs = backlogs;
    }

    @Override
    public boolean checkEligibility(Student student) {

        return student.getCgpa() >= minimumCgpa
                && student.getTenthPercentage() >= minimumTenth
                && student.getTwelfthPercentage() >= minimumTwelfth
                && student.getBacklogs() <= maximumBacklogs;
    }

    @Override
    public void displayCriteria() {

        System.out.println("\nCompany: " + companyName);

        System.out.println("Minimum CGPA: " + minimumCgpa);

        System.out.println("Minimum 10th: " + minimumTenth);

        System.out.println("Minimum 12th: " + minimumTwelfth);

        System.out.println("Maximum Backlogs: " + maximumBacklogs);
    }
}
