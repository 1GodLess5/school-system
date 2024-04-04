package cz.godless;

import cz.godless.domain.Clazz;
import cz.godless.domain.Student;
import cz.godless.domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String firstClassName = "1.A";
        Teacher primaryTeacher = new Teacher("Prokopova", true);

        List<String> studentsSubjects = new ArrayList<>();
        studentsSubjects.add("Math");
        studentsSubjects.add("English");
        studentsSubjects.add("P/E");
        Student student1 = new Student("Albert Gacek", studentsSubjects);
        Student student2 = new Student("Adam Vasek", studentsSubjects);
        Student student3 = new Student("Lukas Byrtus", studentsSubjects);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Clazz firstClass = new Clazz(firstClassName, primaryTeacher, students);

        System.out.println("Class: " + firstClass.getClazzName());
        System.out.println("Primary teacher: " + firstClass.getPrimaryTeacher().getName());
        
        System.out.println("Students: ");
        for (Student student : firstClass.getStudents()) {
            System.out.println("\t" + student.getName() + ": " + student.getTakesSubjects());
        }
        
    }
}
