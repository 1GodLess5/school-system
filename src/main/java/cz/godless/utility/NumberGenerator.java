package cz.godless.utility;

import java.util.Random;

public class NumberGenerator {
    private final static Random random = new Random();

    public static int generateInt(int minValueIncl, int maxValueIncl) {
        return (int) ((Math.random() * (maxValueIncl - minValueIncl + 1)) + minValueIncl);
    }

    public static double generateFloat(double minValueIncl, double maxValueIncl) {
        return (Math.random() * (maxValueIncl - minValueIncl)) + minValueIncl;
    }
}
