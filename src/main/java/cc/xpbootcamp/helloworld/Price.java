package cc.xpbootcamp.helloworld;

import static cc.xpbootcamp.helloworld.Movie.CHILDREN;
import static cc.xpbootcamp.helloworld.Movie.NEW_RELEASE;
import static cc.xpbootcamp.helloworld.Movie.REGULAR;

public abstract class Price {
    abstract int getPriceCode();

    public double getCharge(int daysRented){
        double result = 0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDREN:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }
}
