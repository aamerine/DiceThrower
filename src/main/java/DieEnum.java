public enum DieEnum {
    d4("d4"),
    d6("d6"),
    d8("d8"),
    d10("d10"),
    d12("d12"),
    d20("d20");

    private String name;

    DieEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static DieEnum byName(String name) {
        for (DieEnum d : DieEnum.values()) {
            if (d.name.equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    public static Die getDieByName(String name) {
        DieEnum d = DieEnum.byName(name);
        if(d != null){
            switch (d) {
                case d4:
                    return new Die(4, d4);
                case d6:
                    return new Die(6, d6);
                case d8:
                    return new Die(8, d8);
                case d10:
                    return new Die(10, d10);
                case d12:
                    return new Die(12, d12);
                case d20:
                    return new Die(20, d20);
                default:
                    return null;
            }
        }
        return null;
    }
}