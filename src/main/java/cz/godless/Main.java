package cz.godless;

import cz.godless.domain.Clazz;
import cz.godless.service.MainInitializer;
import cz.godless.utility.PrintUtils;

public class Main {
    public static void main(String[] args) {
        Clazz firstClazz =  MainInitializer.clazzCreator("1.A", "Radka Prokopova", true, 15);
        PrintUtils.printClazz(firstClazz);


        // TODO
        // 1 - work on MainInitializer.java
        //   -> clazzCreator() -> needed to check if student isn't gonna be doubled
        //   -> create SubjectCreator() - based on students subjects
        //


        // TODO FUTURE
        // generateStudents -> int cannot be higher than 225 because of uniqueness
























        // --- CREATING SUBJECT
//        System.out.println();
//        List<Grade> student1Grades = NumberGenerator.generateGrades();
//        List<Grade> student2Grades = NumberGenerator.generateGrades();
//        List<Grade> student3Grades = NumberGenerator.generateGrades();
//
//        Map<Student, List<Grade>> englishStudents = new HashMap<>();
//        englishStudents.put(student1, student1Grades);
//        englishStudents.put(student2, student2Grades);
//        englishStudents.put(student3, student3Grades);
//
//        Subject english = new Subject(Subjects.ENGLISH.getDescription(), primaryTeacher, englishStudents);
//        System.out.println("Subject: " + english.getSubjectName());
//        System.out.println("Teacher: " + english.getTeacherOfSubject().getName());
//        System.out.println("Students: ");
//        for (Map.Entry<Student, List<Grade>> studentsOfSubject : english.getTakesClass().entrySet()) {
//            System.out.println("\t" + studentsOfSubject.getKey().getName() + ": ");
//            for (Grade studentGrades : studentsOfSubject.getValue()) {
//                System.out.println("\t\t" + studentGrades.getGradeValue() + " - " + studentGrades.getGradeDescription());
//            }
//        }
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
