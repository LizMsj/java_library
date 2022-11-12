abstract class People {
    private String name;
    private int total;

    People(String name) {
        this.name = name;
        total++;
    }

    People() {
        total++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String talk() {
        return "Hi! Where I?";
    }
}
