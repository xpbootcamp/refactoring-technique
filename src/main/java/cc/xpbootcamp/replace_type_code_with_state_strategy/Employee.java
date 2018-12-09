package cc.xpbootcamp.replace_type_code_with_state_strategy;

public class Employee {
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
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
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Invalid employee");
        }
    }

}
