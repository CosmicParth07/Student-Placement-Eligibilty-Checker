
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student)
            throws InvalidStudentException {

        if (searchStudent(student.getStudentId()) != null) {

            throw new InvalidStudentException(
                    "Student ID already exists!"
            );
        }

        students.add(student);

        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (int i = 0; i < students.size(); i++) {

            System.out.println("\n-------------------");

            students.get(i).displayDetails();
        }
    }

    public Student searchStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentId() == id) {
                return students.get(i);
            }
        }

        return null;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
