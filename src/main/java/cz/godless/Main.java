package cz.godless;

import cz.godless.domain.Clazz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String firstClassName = "1.A";
        String primaryTeacher = "Prokopova";
        List<String> students = new ArrayList<>();
        students.add("Albert Gacek");
        students.add("Adam Vasek");
        students.add("Lukas Byrtus");

        Clazz firstClass = new Clazz(firstClassName, primaryTeacher, students);

        System.out.println("Class: " + firstClass.getClazzName());
        System.out.println("Primary teacher: " + firstClass.getPrimaryTeacher());
        
        System.out.print("Students: ");
        int studentCount = 0;
        for (String student : students) {
            studentCount++;
            System.out.print(student);
            
            if (studentCount < students.size()) {
                System.out.print(", ");
            }
        }
        
    }
}
