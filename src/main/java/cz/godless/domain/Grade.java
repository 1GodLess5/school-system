package cz.godless.domain;

import cz.godless.enums.CountableEnum;
import cz.godless.enums.StandardizedTests;
import cz.godless.utility.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private final double gradeValue;
    private final String gradeDescription;

    public Grade(double gradeValue, String gradeDescription) {
        this.gradeValue = gradeValue;
        this.gradeDescription = gradeDescription;
    }

    public double getGradeValue() {
        return gradeValue;
    }

    public String getGradeDescription() {
        return gradeDescription;
    }

    public static List<Grade> generateGrades() {
        List<Grade> grades = new ArrayList<>();

        int numberOfGrades = NumberGenerator.generateInt(3, 6);
        int i = 0;
        List<Integer> usedTestTypes = new ArrayList<>();

        while (i < numberOfGrades) {
            double generatedGradeValue = NumberGenerator.generateFloat(1.0, 5.0);
            int generatedTestType = NumberGenerator.generateInt(0, StandardizedTests.values().length);

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
