package cc.xpbootcamp.helloworld;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case CHILDREN:
                price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("Invalid price Code [" + priceCode + "]");
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (price.getPriceCode() == NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
