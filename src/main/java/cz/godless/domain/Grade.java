package cz.godless.domain;

public class Grade {
    private final double gradeValue;
    private final String gradeDescription;

    public Grade(double gradeValue, String gradeDescription) {
        this.gradeValue = gradeValue;
        this.gradeDescription = gradeDescription;
    }

    public double getGradeValue() {
        return gradeValue;
    }

    public String getGradeDescription() {
        return gradeDescription;
    }
}
