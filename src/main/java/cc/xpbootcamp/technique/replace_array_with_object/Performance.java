package cc.xpbootcamp.technique.replace_array_with_object;

public class Performance {
    private String name;
    private String wins;

    public void setName(String name) {
        this.name = name;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return Integer.parseInt(wins);
    }
}
