package cc.xpbootcamp.replace_type_code_with_subclass;

public class Salesman extends Employee {
    @Override
    public int getType() {
        return SALESMAN;
    }
}
