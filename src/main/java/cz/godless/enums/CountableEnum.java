package cz.godless.enums;

public abstract class CountableEnum {
    private final String description;
    private final int count;

    protected CountableEnum(String description, int count) {
        this.description = description;
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }

    protected String getDescriptionByCount(int count) {
        if (count == this.getCount()) {
            return this.getDescription();
        } else return null;
    }
}
