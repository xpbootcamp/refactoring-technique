package cc.xpbootcamp.replace_type_code_with_state_strategy;

public class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return Employee.SALESMAN;
    }
}
