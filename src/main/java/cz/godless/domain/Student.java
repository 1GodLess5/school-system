package cz.godless.domain;

import cz.godless.enums.Subjects;

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
        this.takesSubjects = randomSubjectPicking();
    }

    public String getName() {
        return name;
    }

    public List<Subjects> getTakesSubjects() {
        return takesSubjects;
    }

    private List<Subjects> randomSubjectPicking() {
        List<Subjects> subjects = new ArrayList<>();
        int subjectsLength = 0;
        for (Subjects subject : Subjects.values()) {
            if (subject.getCount() > subjectsLength) {
                subjectsLength = subject.getCount();
            }
        }

        int i = 0;
        while (i < 5) {
            int generateInt = (int) ((Math.random() * (subjectsLength + 1)) + 0);
            for (Subjects subject : Subjects.values()) {
                if (subject.getCount() == generateInt) {
                    if (!subjects.contains(subject)) {
                        subjects.add(subject);
                        i++;
                    }
                }
            }
        }

        return subjects;
    }
}
