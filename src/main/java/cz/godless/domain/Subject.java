package cz.godless.domain;

import java.util.List;
import java.util.Map;

public class Subject {
    private final String subjectName;
    private final Teacher teacherOfSubject;
    private final Map<Student, List<Grade>> takesClass;

    public Subject(String subjectName, Teacher teacherOfSubject, Map<Student, List<Grade>> takesClass) {
        this.subjectName = subjectName;
        this.teacherOfSubject = teacherOfSubject;
        this.takesClass = takesClass;
    }

    public Teacher getTeacherOfSubject() {
        return teacherOfSubject;
    }

    public Map<Student, List<Grade>> getTakesClass() {
        return takesClass;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
