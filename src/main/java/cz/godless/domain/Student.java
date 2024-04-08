package cz.godless.domain;

import cz.godless.enums.Subjects;
import cz.godless.utility.NumberGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Student {
    private final String name;
    private final List<Subjects> takesSubjects;
    private final Random random = new Random();

    public Student(String name) {
        this.name = name;
        this.takesSubjects = NumberGenerator.randomSubjectPicking();
    }

    public String getName() {
        return name;
    }

    public List<Subjects> getTakesSubjects() {
        return takesSubjects;
    }
}
