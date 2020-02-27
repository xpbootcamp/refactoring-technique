package cc.xpbootcamp.technique.replace_primitive_with_object;

import java.time.LocalDate;

public class Order {
    private String id;
    private String priority;
    private LocalDate createdDate;

    public Order(String id, String priority, LocalDate createdDate) {
        this.id = id;
        this.priority = priority;
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
