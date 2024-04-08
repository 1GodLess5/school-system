package cz.godless.enums;

public enum StandardizedTests {
    ;

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
