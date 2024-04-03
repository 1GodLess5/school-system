package cz.godless.domain;

import java.util.List;

public class Clazz {
    private final String clazzName;
    private final String primaryTeacher;
    private final List<String> students;

    public Clazz(String clazzName, String primaryTeacher, List<String> students) {
        this.clazzName = clazzName;
        this.primaryTeacher = primaryTeacher;
        this.students = students;
    }
}
