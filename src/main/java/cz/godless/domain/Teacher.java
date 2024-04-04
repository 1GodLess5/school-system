package cz.godless.domain;

public class Teacher {
    private String name;
    private final boolean isWoman;

    public Teacher(String name, boolean isWoman) {
        this.name = name;
        this.isWoman = isWoman;
    }

    private void nameGender() {
        String nameBase = this.name;
        this.name = isWoman ? "Ms. " + nameBase : "Mr. " + nameBase;
    }
}
