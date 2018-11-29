package cc.xpbootcamp.move_method;

public class Account {
    private int daysOverdrawn;
    private AccountType type;

    public Account(int daysOverdrawn, AccountType type) {
        this.daysOverdrawn = daysOverdrawn;
        this.type = type;
    }

    public double overdraftCharge() {
        return type.overdraftCharge(daysOverdrawn);
    }

    double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += type.overdraftCharge(daysOverdrawn);
        }
        return result;
    }
}
