
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSorter {

    public void sortByCgpa(ArrayList<Student> students) {

        Collections.sort(students,
                new Comparator<Student>() {

                    @Override
                    public int compare(Student s1, Student s2) {

                        return Double.compare(
                                s2.getCgpa(),
                                s1.getCgpa()
                        );
                    }
                }
        );

        System.out.println("Students sorted by CGPA!");
    }
}
