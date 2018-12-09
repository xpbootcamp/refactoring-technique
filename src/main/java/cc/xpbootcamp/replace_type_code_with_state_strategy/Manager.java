package cc.xpbootcamp.replace_type_code_with_state_strategy;

public class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return Employee.MANAGER;
    }
}
