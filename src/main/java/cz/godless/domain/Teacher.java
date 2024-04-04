package cz.godless.domain;

public class Teacher {
    private final String name;
    private final boolean isWoman;

    public Teacher(String name, boolean isWoman) {
        this.isWoman = isWoman;
        this.name = nameGender(name);
    }

    private String nameGender(String name) {
        return this.isWoman ? "Ms. " + name : "Mr. " + name;
    }

    public String getName() {
        return name;
    }
}
