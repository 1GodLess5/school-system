package cz.godless;

import cz.godless.domain.*;
import cz.godless.enums.Subjects;
import cz.godless.utility.NumberGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.println();
        List<Grade> student1Grades = NumberGenerator.generateGrades();
        List<Grade> student2Grades = NumberGenerator.generateGrades();
        List<Grade> student3Grades = NumberGenerator.generateGrades();

        Map<Student, List<Grade>> englishStudents = new HashMap<>();
        englishStudents.put(student1, student1Grades);
        englishStudents.put(student2, student2Grades);
        englishStudents.put(student3, student3Grades);

        Subject english = new Subject(Subjects.ENGLISH.getDescription(), primaryTeacher, englishStudents);
        System.out.println("Subject: " + english.getSubjectName());
        System.out.println("Teacher: " + english.getTeacherOfSubject().getName());
        System.out.println("Students: ");
        for (Map.Entry<Student, List<Grade>> studentsOfSubject : english.getTakesClass().entrySet()) {
            System.out.println("\t" + studentsOfSubject.getKey().getName() + ": ");
            for (Grade studentGrades : studentsOfSubject.getValue()) {
                System.out.println("\t\t" + studentGrades.getGradeValue() + " - " + studentGrades.getGradeDescription());
            }
        }
        // ---

        // --- TESTING NEW FUNCTIONS
//        List<Grade> newGrades = NumberGenerator.generateGrades();
//        for (Grade grade : newGrades) {
//            System.out.println("Grade: " + grade.getGradeValue());
//            System.out.println("Description: " + grade.getGradeDescription());
//        }
        // ---


    }


}
