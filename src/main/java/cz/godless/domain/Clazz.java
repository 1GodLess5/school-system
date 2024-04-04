package cz.godless.domain;

import java.util.List;

public class Clazz {
    private final String clazzName;
    private final Teacher primaryTeacher;
    private final List<Student> students;

    public Clazz(String clazzName, Teacher primaryTeacher, List<Student> students) {
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

    public List<Student> getStudents() {
        return students;
    }
}
