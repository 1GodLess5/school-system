package cz.godless.domain;

import cz.godless.enums.CountableEnum;
import cz.godless.enums.Subjects;
import cz.godless.utility.NumberGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Student {
    private final String name;
    private final List<String> takesSubjects;
    private final Random random = new Random();

    public Student(String name) {
        this.name = name;
        this.takesSubjects = this.randomSubjectPicking();
    }

    public String getName() {
        return name;
    }

    public List<String> getTakesSubjects() {
        return takesSubjects;
    }

    private List<String> randomSubjectPicking() {
        List<String> subjects = new ArrayList<>();
        int i = 0;

        while (i < 5) {
            int generatedInt = NumberGenerator.generateInt(0, Subjects.values().length - 1);
            if (!subjects.contains(CountableEnum.getDescriptionByCount(generatedInt, Subjects.class)) && generatedInt >= 0 && generatedInt < Subjects.values().length) {
                subjects.add(CountableEnum.getDescriptionByCount(generatedInt, Subjects.class));
                i++;
            }
        }
        return subjects;
    }
}
