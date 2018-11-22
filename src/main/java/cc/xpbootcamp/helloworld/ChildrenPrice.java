package cc.xpbootcamp.helloworld;

public class ChildrenPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }
}
