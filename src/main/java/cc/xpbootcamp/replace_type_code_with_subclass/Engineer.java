package cc.xpbootcamp.replace_type_code_with_subclass;

public class Engineer extends Employee {
    @Override
    public int getType() {
        return ENGINEER;
    }
}
