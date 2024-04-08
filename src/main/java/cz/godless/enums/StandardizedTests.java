package cz.godless.enums;

public enum StandardizedTests {
    DIAGNOSTIC_ASSESSMENT("Diagnostic Assessment", 0),
    IPSATIVE_ASSESSMENT("Ipsative Assessment", 1),
    PLACEMENT_TEST("Placement Test", 2),
    MULTIPLE_CHOICE("Multiple Choice", 3),
    WRITTEN_TEST("Written Test", 4),
    ACHIEVEMENT_TEST("Achievement Test", 5),
    ORAL_EXAMS("Oral Exams", 6),
    SKILL_ASSESSMENT("Skill Assessment", 7);

    private final String description;
    private final int count;

    StandardizedTests(String description, int count) {
        this.description = description;
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }
}
