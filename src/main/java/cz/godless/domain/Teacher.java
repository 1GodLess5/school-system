package cz.godless.domain;

public class Teacher {
    private String name;
    private final boolean isWoman;

    public Teacher(String name, boolean isWoman) {
        this.name = nameGender(name);
        this.isWoman = isWoman;
    }

    private String nameGender(String name) {
        return isWoman ? "Ms. " + name : "Mr. " + name;
    }

    public String getName() {
        return name;
    }
}
