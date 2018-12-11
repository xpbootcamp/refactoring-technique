package cc.xpbootcamp.replace_nested_conditional_with_guard_clause;

public class Calculator {
    private static final double ADJ_FACTOR = 1.2;

    private double income;
    private double duration;
    private double initRate;
    private double capital;

    public void setIncome(double income) {
        this.income = income;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setInitRate(double initRate) {
        this.initRate = initRate;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getAdjustedCapital() {
        double result = 0.0;
        if (capital > 0.0) {
            if (initRate > 0.0 && duration > 0.0) {
                result = (income/duration)* ADJ_FACTOR;
            }
        }
        return result;
    }
}
