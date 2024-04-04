package cz.godless;

import cz.godless.domain.Clazz;
import cz.godless.domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String firstClassName = "1.A";
        Teacher primaryTeacher = new Teacher("Prokopova", true);
        List<String> students = new ArrayList<>();
        students.add("Albert Gacek");
        students.add("Adam Vasek");
        students.add("Lukas Byrtus");

        Clazz firstClass = new Clazz(firstClassName, primaryTeacher, students);

        System.out.println("Class: " + firstClass.getClazzName());
        System.out.println("Primary teacher: " + firstClass.getPrimaryTeacher().getName());
        
        System.out.print("Students: ");
        int studentCount = 0;
        for (String student : firstClass.getStudents()) {
            studentCount++;
            System.out.print(student);
            
            if (studentCount < firstClass.getStudents().size()) {
                System.out.print(", ");
            }
        }
        
    }
}
