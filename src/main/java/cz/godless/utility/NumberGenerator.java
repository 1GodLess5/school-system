package cz.godless.utility;

import cz.godless.domain.Grade;
import cz.godless.enums.StandardizedTests;
import cz.godless.enums.Subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    private final static Random random = new Random();

    private static int generateInt(int minValueIncl, int maxValueIncl) {
        return (int) ((Math.random() * (maxValueIncl - minValueIncl + 1)) + minValueIncl);
    }

    private static double generateFloat(double minValueIncl, double maxValueIncl) {
        return (Math.random() * (maxValueIncl - minValueIncl)) + minValueIncl;
    }

    public static List<Subjects> randomSubjectPicking() {
        List<Subjects> subjects = new ArrayList<>();
        int i = 0;

        while (i < 5) {
            int generatedInt = generateInt(0, Subjects.values().length - 1);
            for (Subjects subject : Subjects.values()) {
                if (subject.getCount() == generatedInt && !subjects.contains(subject)) {
                    subjects.add(subject);
                    i++;
                }
            }
        }

        return subjects;
    }

    public static List<Grade> generateGrades() {
        List<Grade> grades = new ArrayList<>();

        int numberOfGrades = generateInt(3, 6);
        int i = 0;
        List<Integer> usedTestTypes = new ArrayList<>();

        while (i < numberOfGrades) {
            double generatedGradeValue = generateFloat(1.0, 5.0);
            int generatedTestType = generateInt(0, StandardizedTests.values().length);
            for (StandardizedTests tests : StandardizedTests.values()) {
                if (tests.getCount() == generatedTestType && !usedTestTypes.contains(generatedTestType)) {
                    usedTestTypes.add(generatedTestType);
                    Grade grade = new Grade((double) Math.round(generatedGradeValue * 10.0) / 10, tests.getDescription());
                    grades.add(grade);
                    i++;
                }
            }
        }

        return grades;
    }
}
