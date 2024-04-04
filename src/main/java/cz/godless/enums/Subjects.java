package cz.godless.enums;

public enum Subjects {
    MATHEMATICS("Mathematics"),
    ENGLISH("English"),
    P_E("P/E");

    private final String description;

    Subjects(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
