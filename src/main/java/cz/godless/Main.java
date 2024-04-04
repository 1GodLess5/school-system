package cz.godless;

import cz.godless.domain.Clazz;
import cz.godless.domain.Student;
import cz.godless.domain.Teacher;
import cz.godless.enums.Subjects;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String firstClassName = "1.A";
        Teacher primaryTeacher = new Teacher("Prokopova", true);

        Student student1 = new Student("Albert Gacek");
        Student student2 = new Student("Adam Vasek");
        Student student3 = new Student("Lukas Byrtus");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Clazz firstClass = new Clazz(firstClassName, primaryTeacher, students);

        System.out.println("Class: " + firstClass.getClazzName());
        System.out.println("Primary teacher: " + firstClass.getPrimaryTeacher().getName());
        
        System.out.println("Students: ");
        for (Student student : firstClass.getStudents()) {
            System.out.print("\t" + student.getName() + ": ");
            for (Subjects subject : student.getTakesSubjects()) {
                System.out.print(subject.getDescription() + ", ");
            }
            System.out.println();
        }
        
    }


}
