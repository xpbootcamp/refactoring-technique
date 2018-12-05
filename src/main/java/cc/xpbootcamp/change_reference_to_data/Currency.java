package cc.xpbootcamp.change_reference_to_data;

import cc.xpbootcamp.replace_data_value_with_object.Customer;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private static Map<String, Currency> currencies = new HashMap<>();

    private String code;

    private Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Currency get(String code) {
        if (currencies.containsKey(code)){
            return currencies.get(code);
        }
        Currency currency = new Currency(code);
        currencies.put(code, currency);
        return currency;
    }
}
