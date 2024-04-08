package cz.godless.domain;

import java.util.List;
import java.util.Map;

public class Subject {
    private final Teacher teacher;
    private final Map<Student, List<Float>> takesClass;

    public Subject(Teacher teacher, Map<Student, List<Float>> takesClass) {
        this.teacher = teacher;
        this.takesClass = takesClass;
    }
}
