package cc.xpbootcamp.technique.replace_data_value_with_object;

public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = Customer.obtainCustomer(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        this.customer = Customer.obtainCustomer(customerName);
    }

}
