package cc.xpbootcamp.technique.move_field;

public class Account {
    private AccountType type;

    public Account(double interestRate, AccountType type) {
        type.setInterestRate(interestRate);
        this.type = type;
    }

    double interest(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }
}
