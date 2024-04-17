package cz.godless.manager;

import cz.godless.domain.Clazz;
import cz.godless.domain.Student;
import cz.godless.enums.CommonNames;
import cz.godless.enums.CountableEnum;
import cz.godless.utility.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class MainInitializer {
    public static void clazzCreator(String className, String primaryTeacherName, Boolean isWoman, int numberOfStudents) {

    }

    public static List<Student> generateStudents(int numberOfStudents) {
        List<Student> generatedStudents = new ArrayList<>();
        List<String> usedNames = new ArrayList<>();
        int i = 0;
        int tries = 0;

        while (i < numberOfStudents) {
            int generateName = 0;
            int generateSurname = 0;
            String name, surname, finalName;
            boolean addedNewName = false;

            while (!addedNewName) {
                generateName = NumberGenerator.generateInt(0, 14);
                generateSurname = NumberGenerator.generateInt(15, 29);
                name = CountableEnum.getDescriptionByCount(generateName, CommonNames.class);
                surname = CountableEnum.getDescriptionByCount(generateSurname, CommonNames.class);
                finalName = name + " " + surname;

                if (!usedNames.contains(finalName)) {
                    Student student = new Student(finalName);
                    generatedStudents.add(student);
                    usedNames.add(finalName);
                    addedNewName = true;
                    i ++;
                    System.out.println(name + " " + surname);
                }
                tries++;
            }









        }
        System.out.println(tries);
        return generatedStudents;
    }
}
