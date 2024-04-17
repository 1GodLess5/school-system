package cz.godless.utility;

import cz.godless.domain.Clazz;
import cz.godless.domain.Student;

public class PrintUtils {
    public static void printDivider(int howLong) {
        String divider = "";
        for (int i = 0; i < howLong; i++) {
            divider += "-";
        }
        System.out.println(divider);
    }

    public static void printClazz(Clazz clazz) {
        printDivider(85);
        System.out.println("Class: " + clazz.getClazzName());
        System.out.println("Primary teacher: " + clazz.getPrimaryTeacher().getName());
        printDivider(17 + clazz.getPrimaryTeacher().getName().length());
        System.out.println("Students: ");
        for (Student student : clazz.getStudents()) {
            System.out.printf("\t%-20s -\t", student.getName());
            int counter = 1;
            for (String subject : student.getTakesSubjects()) {
                if (counter + 1 > student.getTakesSubjects().size()) {
                    System.out.print(subject);
                } else {
                    System.out.print(subject + ", ");
                }
                counter++;
            }
            System.out.println();
        }
        printDivider(85);
    }
}
