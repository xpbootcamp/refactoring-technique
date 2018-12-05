package cc.xpbootcamp.replace_array_with_object;

public class Performance {
    private String data[] = new String[2];

    public void setName(String name) {
        data[0] = name;
    }

    public void setWins(String wins) {
        data[1] = wins;
    }

    public String getName() {
        return data[0];
    }

    public int getWins() {
        return Integer.parseInt(data[1]);
    }
}
