package cc.xpbootcamp.replace_type_code_with_subclass;

public class EmployeeFactory {
    static Employee create(int type) {
        if (type == Employee.ENGINEER) {
            return new Engineer();
        }
        if (type == Employee.SALESMAN) {
            return new Salesman();
        }
        if (type == Employee.MANAGER) {
            return new Manager();
        }
        throw new IllegalArgumentException("Invalid employ type [" + type + "]");
    }
}
