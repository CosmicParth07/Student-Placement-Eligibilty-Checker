
public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        EligibilityChecker checker = new EligibilityChecker();

        StudentSorter sorter = new StudentSorter();

        StudentReport report = new StudentReport();

        InputHandler input = new InputHandler();

        // Company criteria

        PlacementCriteria companyA =
                new CompanyCriteria("Company A", 7.0, 60, 60, 0);

        PlacementCriteria companyB =
                new CompanyCriteria("Company B", 8.0, 70, 70, 0);

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println(" STUDENT PLACEMENT ELIGIBILITY CHECKER");
            System.out.println("==================================");

            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Check Placement Eligibility");
            System.out.println("5. View Company Criteria");
            System.out.println("6. Sort Students By CGPA");
            System.out.println("7. Generate Placement Report");
            System.out.println("8. Exit");

            choice = input.readInt("Enter your choice: ", 1, 8);

            switch (choice) {

                case 1:

                    int id = input.readInt(
                            "Enter Student ID: ", 1, Integer.MAX_VALUE);

                    String name = input.readString(
                            "Enter Student Name: ");

                    double cgpa = input.readDouble(
                            "Enter CGPA: ", 0, 10);

                    double tenth = input.readDouble(
                            "Enter 10th Percentage: ", 0, 100);

                    double twelfth = input.readDouble(
                            "Enter 12th Percentage: ", 0, 100);

                    int backlogs = input.readInt(
                            "Enter Backlogs: ", 0, Integer.MAX_VALUE);

                    Student student = new Student(
                            id, name, cgpa, tenth, twelfth, backlogs);

                    try {

                        manager.addStudent(student);

                    } catch (InvalidStudentException e) {

                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:

                    manager.displayAllStudents();

                    break;

                case 3:

                    int searchId = input.readInt(
                            "Enter Student ID to search: ",
                            1, Integer.MAX_VALUE);

                    Student found = manager.searchStudent(searchId);

                    if (found != null) {

                        found.displayDetails();

                    } else {

                        System.out.println("Student not found!");
                    }

                    break;

                case 4:

                    int checkId = input.readInt(
                            "Enter Student ID: ",
                            1, Integer.MAX_VALUE);

                    Student selected = manager.searchStudent(checkId);

                    if (selected == null) {

                        System.out.println("Student not found!");

                    } else {

                        System.out.println("1. Company A");
                        System.out.println("2. Company B");

                        int companyChoice = input.readInt(
                                "Select Company: ", 1, 2);

                        if (companyChoice == 1) {

                            checker.checkStudent(selected, companyA);

                        } else {

                            checker.checkStudent(selected, companyB);
                        }
                    }

                    break;

                case 5:

                    companyA.displayCriteria();

                    companyB.displayCriteria();

                    break;

                case 6:

                    sorter.sortByCgpa(manager.getStudents());

                    manager.displayAllStudents();

                    break;

                case 7:

                    report.generateReport(
                            manager.getStudents(), companyA);

                    Thread reportThread =
                            new Thread(new BackgroundTask());

                    reportThread.start();

                    try {

                        reportThread.join();

                    } catch (InterruptedException e) {

                        System.out.println("Main thread interrupted!");

                        Thread.currentThread().interrupt();
                    }

                    break;

                case 8:

                    System.out.println("Thank you for using our project!");

                    break;
            }

        } while (choice != 8);
    }
}
