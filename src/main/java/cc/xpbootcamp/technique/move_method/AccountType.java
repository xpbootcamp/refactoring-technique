package cc.xpbootcamp.technique.move_method;

public class AccountType {
    public static final String TYPE_CODE_PREMIUM = "Premium";

    private String typeCode;

    public AccountType(String typeCode) {
        this.typeCode = typeCode;
    }

    public boolean isPremium() {
        return TYPE_CODE_PREMIUM.equals(typeCode);
    }

    public double overdraftCharge(double daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
                return result;
            }
        }
        return daysOverdrawn * 0.75;
    }
}
