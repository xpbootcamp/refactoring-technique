package cc.xpbootcamp.replace_type_code_with_subclass;

public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee(int type) {
        this.type = type;
    }

    public boolean isEngineer(){
        return type == ENGINEER;
    }

    public boolean isSalesman(){
        return type == SALESMAN;
    }

    public boolean isManager(){
        return type == MANAGER;
    }
}
