
public class EligibilityChecker {

    public boolean checkStudent(Student student,
                                PlacementCriteria criteria) {

        boolean result = criteria.checkEligibility(student);

        System.out.println("\n===== ELIGIBILITY RESULT =====");

        System.out.println("Student: " + student.getName());

        if (result) {

            System.out.println("Status: ELIGIBLE");

        } else {

            System.out.println("Status: NOT ELIGIBLE");
        }

        return result;
    }
}
