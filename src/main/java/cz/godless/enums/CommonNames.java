package cz.godless.enums;

public enum CommonNames implements CountableEnum {
    // names
    name1("Jiri", 0),
    name2("Jan", 1),
    name3("Petr", 2),
    name4("Josef", 3),
    name5("Miroslav", 4),
    name6("Pavel", 5),
    name7("Martin", 6),
    name8("Tomas", 7),
    name9("Jaroslav", 8),
    name10("Zdenek", 9),
    name11("Vaclav", 10),
    name12("Michal", 11),
    name13("Frantisek", 12),
    name14("Jakub", 13),
    name15("Milan", 14),
    // surnames
    name16("Novak", 15),
    name17("Svoboda", 16),
    name18("Novotny", 17),
    name19("Dvorak", 18),
    name20("Cerny", 19),
    name21("Prochazka", 20),
    name22("Kucera", 21),
    name23("Vesely", 22),
    name24("Horak", 23),
    name25("Nemec", 24),
    name26("Pospisil", 25),
    name27("Pokorny", 26),
    name28("Hajek", 27),
    name29("Kral", 28),
    name30("Jelinek", 29);


    private final String description;
    private final int count;

    CommonNames(String description, int count) {
        this.description = description;
        this.count = count;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCount() {
        return count;
    }
}
