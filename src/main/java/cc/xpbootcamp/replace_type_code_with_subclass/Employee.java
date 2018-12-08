package cc.xpbootcamp.replace_type_code_with_subclass;

public abstract class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;


    static Employee create(int type) {
        if (type == ENGINEER) {
            return new Engineer();
        }
        if (type == SALESMAN) {
            return new Salesman();
        }
        if (type == MANAGER) {
            return new Manager();
        }
        throw new IllegalArgumentException("Invalid employ type [" + type + "]");
    }

    public abstract int getType();


    public boolean isEngineer() {
        return getType() == ENGINEER;
    }

    public boolean isSalesman() {
        return getType() == SALESMAN;
    }

    public boolean isManager() {
        return getType() == MANAGER;
    }
}
