package cc.xpbootcamp.move_field;

public class Account {
    private AccountType type;
    private double interestRate;

    public Account(double interestRate, AccountType type) {
        setInterestRate(interestRate);
        this.type = type;
    }

    private void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double interest(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    private double getInterestRate() {
        return interestRate;
    }
}
