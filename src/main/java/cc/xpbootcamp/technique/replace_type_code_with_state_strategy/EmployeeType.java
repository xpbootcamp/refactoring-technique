package cc.xpbootcamp.technique.replace_type_code_with_state_strategy;

public abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    protected int monthlySalary;
    protected int commission;
    protected int bonus;

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    abstract int getTypeCode();

    public static EmployeeType generateType(int typeCode) {
        switch (typeCode) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new RuntimeException("Invalid employee");
        }
    }

    public abstract int payAmount();

}
