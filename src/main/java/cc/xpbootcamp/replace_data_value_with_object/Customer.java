package cc.xpbootcamp.replace_data_value_with_object;

public class Customer {
    private String name;

    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Customer create(String name) {
        return new Customer(name);
    }
}
