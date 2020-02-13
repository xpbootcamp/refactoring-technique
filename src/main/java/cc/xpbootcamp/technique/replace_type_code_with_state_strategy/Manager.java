package cc.xpbootcamp.technique.replace_type_code_with_state_strategy;

public class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override
    public int payAmount() {
        return monthlySalary + bonus;
    }
}
