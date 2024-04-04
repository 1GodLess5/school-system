package cz.godless.domain;

import java.util.List;

public class Clazz {
    private final String clazzName;
    private final Teacher primaryTeacher;
    private final List<String> students;

    public Clazz(String clazzName, Teacher primaryTeacher, List<String> students) {
        this.clazzName = clazzName;
        this.primaryTeacher = primaryTeacher;
        this.students = students;
    }

    public String getClazzName() {
        return clazzName;
    }

    public Teacher getPrimaryTeacher() {
        return primaryTeacher;
    }

    public List<String> getStudents() {
        return students;
    }
}
