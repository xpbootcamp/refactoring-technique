package cc.xpbootcamp.technique.replace_type_code_with_state_strategy;

public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return ENGINEER;
    }

    @Override
    public int payAmount() {
        return monthlySalary;
    }
}
