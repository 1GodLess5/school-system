package cz.godless;

import cz.godless.domain.*;
import cz.godless.enums.Subjects;
import cz.godless.utility.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- CREATING CLAZZ
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
        // ---

        // --- CREATING SUBJECT
        List<Grade> student1Grades = new ArrayList<>();


        // ---

        // --- TESTING NEW FUNCTIONS
        List<Grade> newGrades = NumberGenerator.generateGrades();
        for (Grade grade : newGrades) {
            System.out.println("Grade: " + grade.getGradeValue());
            System.out.println("Description: " + grade.getGradeDescription());
        }
        // ---


    }


}
