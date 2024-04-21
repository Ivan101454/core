package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Ivan", "Ivanovich", 20, 9.8),
                new Student("Petr", "Petrovich", 35, 6.3),
                new Student("Gennadiy", "Sidorovich", 37, 7.8),
                new Student("Weronika", "Ivanovna", 36, 9.9),
                new Student("Sidor", "Sidorovich", 25, 5.4));

        getStudent(students);
    }

    private static void getStudent(List<Student> students) {
        Collections.sort(students, new ComparatorAge());
        System.out.println(students);
        Collections.sort(students, new ComparatorNameLastName());
        System.out.println(students);
        students.sort(Comparator.comparing(Student::getAverageScore));
        System.out.println(students);
    }
}
