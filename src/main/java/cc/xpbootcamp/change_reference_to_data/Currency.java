package cc.xpbootcamp.change_reference_to_data;

import cc.xpbootcamp.replace_data_value_with_object.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Currency {
    private static Map<String, Currency> currencies = new HashMap<>();

    private final String code;

    public Currency(String code) {
        this.code = code;
    }


    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Currency currency = (Currency) o;
        return Objects.equals(code, currency.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
