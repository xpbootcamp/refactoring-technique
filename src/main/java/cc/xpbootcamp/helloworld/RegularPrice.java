package cc.xpbootcamp.helloworld;

public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
