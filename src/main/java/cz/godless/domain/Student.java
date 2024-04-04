package cz.godless.domain;

import cz.godless.enums.Subjects;

import java.util.List;

public class Student {
    private final String name;
    private final List<Subjects> takesSubjects;

    public Student(String name, List<Subjects> takesSubjects) {
        this.name = name;
        this.takesSubjects = takesSubjects;
    }

    public String getName() {
        return name;
    }

    public List<Subjects> getTakesSubjects() {
        return takesSubjects;
    }
}
