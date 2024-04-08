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
        return ((Math.random() * (maxValueIncl - minValueIncl + 1)) + minValueIncl);
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
}
