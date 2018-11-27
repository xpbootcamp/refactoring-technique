package cc.xpbootcamp.replace_method_with_method_object;

public class Account {

    private int delta = 5;

    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    public int delta() {
        return delta;
    }
}
