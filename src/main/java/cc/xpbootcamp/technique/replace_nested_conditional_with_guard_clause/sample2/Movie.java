package cc.xpbootcamp.technique.replace_nested_conditional_with_guard_clause.sample2;

public class Movie {

    static final int CAMPUS = 2;
    static final int HISTORY = 0;
    static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    private boolean isInPromotionPeriod;


    Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public void setPromote(){
        this.isInPromotionPeriod = true;
    }

    public boolean isInPromotionPeriod(){
        return isInPromotionPeriod;
    }

    int getPriceCode() {
        return priceCode;
    }

    String getTitle() {
        return title;
    }
}
