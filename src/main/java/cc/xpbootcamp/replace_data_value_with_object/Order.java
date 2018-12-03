package cc.xpbootcamp.replace_data_value_with_object;

public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = Customer.create(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        this.customer = Customer.create(customerName);
    }

}
