package cz.godless.domain;

public class Teacher {
    private String name;
    private final boolean isWoman;

    public Teacher(String name, boolean isWoman) {
        this.name = name;
        this.isWoman = isWoman;
    }
}
