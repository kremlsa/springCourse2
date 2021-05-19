package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Alex", 4, 7.5);
        Student st2 = new Student("Alice", 3, 6.5);
        Student st3 = new Student("Bob", 2, 5.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Begin work getStudents");
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
