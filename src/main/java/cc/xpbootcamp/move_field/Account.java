package cc.xpbootcamp.move_field;

public class Account {
    private AccountType type;
    private double interestRate;

    public Account(double interestRate, AccountType type) {
        this.interestRate = interestRate;
        this.type = type;
    }

    double interest(double amount, int days) {
        return interestRate * amount * days / 365;
    }
}
