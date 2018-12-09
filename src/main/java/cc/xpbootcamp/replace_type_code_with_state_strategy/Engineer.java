package cc.xpbootcamp.replace_type_code_with_state_strategy;

public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
