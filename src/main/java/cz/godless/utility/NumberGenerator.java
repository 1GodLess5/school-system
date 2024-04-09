package cz.godless.utility;

import cz.godless.domain.Grade;
import cz.godless.enums.CountableEnum;
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

    public static List<String> randomSubjectPicking() {
        List<String> subjects = new ArrayList<>();
        int i = 0;

        while (i < 5) {
            int generatedInt = generateInt(0, Subjects.values().length - 1);
            if (!subjects.contains(CountableEnum.getDescriptionByCount(generatedInt, Subjects.class)) && generatedInt >= 0 && generatedInt < Subjects.values().length) {
                subjects.add(CountableEnum.getDescriptionByCount(generatedInt, Subjects.class));
                i++;
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

            if (!usedTestTypes.contains(generatedTestType) && generatedTestType >= 0 && generatedTestType < StandardizedTests.values().length) {
                usedTestTypes.add(generatedTestType);
                Grade grade = new Grade((double) Math.round(generatedGradeValue * 10.0) / 10, CountableEnum.getDescriptionByCount(generatedTestType, StandardizedTests.class));
                grades.add(grade);
                i++;
            }

        }
        return grades;
    }
}
