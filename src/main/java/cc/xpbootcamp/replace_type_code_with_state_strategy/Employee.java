package cc.xpbootcamp.replace_type_code_with_state_strategy;

public class Employee {
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public void setMonthlySalary(int monthlySalary) {
        type.setMonthlySalary(monthlySalary);
    }

    public void setCommission(int commission) {
        type.setCommission(commission);
    }

    public void setBonus(int bonus) {
        type.setBonus(bonus);
    }

    public Employee(int type) {
        setType(type);
    }

    public int getType() {
        return type.getTypeCode();
    }

    public void setType(int typeCode) {
        this.type = EmployeeType.generateType(typeCode);
    }

    public int payAmount() {
        return type.payAmount();
    }

}
