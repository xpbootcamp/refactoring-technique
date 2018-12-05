package cc.xpbootcamp.replace_data_value_with_object;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private static Map<String, Customer> customers = new HashMap<>();

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

    public static Customer obtainCustomer(String name) {
        if (customers.containsKey(name)){
            return customers.get(name);
        }
        Customer customer = new Customer(name);
        customers.put(name, customer);
        return customer;
    }

}
