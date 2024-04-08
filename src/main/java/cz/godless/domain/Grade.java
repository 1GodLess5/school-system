package cz.godless.domain;

public class Grade {
    private final float gradeValue;
    private final String gradeDescription;

    public Grade(float gradeValue, String gradeDescription) {
        this.gradeValue = gradeValue;
        this.gradeDescription = gradeDescription;
    }

    public float getGradeValue() {
        return gradeValue;
    }

    public String getGradeDescription() {
        return gradeDescription;
    }
}
