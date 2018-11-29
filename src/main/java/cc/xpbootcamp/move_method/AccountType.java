package cc.xpbootcamp.move_method;

public class AccountType {
    public static final String TYPE_CODE_PREMIUM = "Premium";

    private String typeCode;

    public AccountType(String typeCode) {
        this.typeCode = typeCode;
    }

    public boolean isPremium() {
        return TYPE_CODE_PREMIUM.equals(typeCode);
    }
}
