
import java.util.ArrayList;

public class StudentReport {

    public void generateReport(ArrayList<Student> students,
                               PlacementCriteria criteria) {

        StringBuilder report = new StringBuilder();

        int eligible = 0;
        int notEligible = 0;

        report.append("\n===== PLACEMENT REPORT =====\n");

        for (int i = 0; i < students.size(); i++) {

            Student student = students.get(i);

            if (criteria.checkEligibility(student)) {

                eligible++;

                report.append(student.getName())
                        .append(" - ELIGIBLE\n");

            } else {

                notEligible++;

                report.append(student.getName())
                        .append(" - NOT ELIGIBLE\n");
            }
        }

        report.append("\nTotal Students: ")
                .append(students.size());

        report.append("\nEligible Students: ")
                .append(eligible);

        report.append("\nNot Eligible Students: ")
                .append(notEligible);

        System.out.println(report.toString());
    }
}
