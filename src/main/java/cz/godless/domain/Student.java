package cz.godless.domain;

import java.util.List;

public class Student {
    private final String name;
    private final List<String> takesSubjects;

    public Student(String name, List<String> takesSubjects) {
        this.name = name;
        this.takesSubjects = takesSubjects;
    }

    public String getName() {
        return name;
    }

    public List<String> getTakesSubjects() {
        return takesSubjects;
    }
}
