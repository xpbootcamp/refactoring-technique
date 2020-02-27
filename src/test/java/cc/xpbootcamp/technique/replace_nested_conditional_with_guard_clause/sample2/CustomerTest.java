package cc.xpbootcamp.technique.replace_nested_conditional_with_guard_clause.sample2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {

    @Test
    void should_return_correct_result_when_call_statement() {
        Customer customer = new Customer("老王");
        customer.addRental(new Rental(new Movie("同桌的你", Movie.CAMPUS), 4));
        customer.addRental(new Rental(new Movie("宠爱", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("战狼2", Movie.HISTORY), 6));

        assertThat("Rental Record for 老王：\n" +
                "\t同桌的你\t3.0\n" +
                "\t宠爱\t15.0\n" +
                "\t战狼2\t8.0\n" +
                "Amount owed is 26.0\n" +
                "You earned 4 frequent renter points").isEqualTo(customer.statement());
    }


    @Test
    void should_return_correct_result_when_call_statement_given_promoted_movie_less_than_10_days() {
        Customer customer = new Customer("老王");
        Movie movie = new Movie("同桌的你", Movie.CAMPUS);
        movie.setPromote();
        customer.addRental(new Rental(movie, 8));

        assertThat("Rental Record for 老王：\n" +
                "\t同桌的你\t5.0\n" +
                "Amount owed is 5.0\n" +
                "You earned 1 frequent renter points").isEqualTo(customer.statement());
    }

    @Test
    void should_return_correct_result_when_call_statement_given_promoted_movie_more_than_10_days() {
        Customer customer = new Customer("老王");
        Movie movie = new Movie("同桌的你", Movie.CAMPUS);
        movie.setPromote();
        customer.addRental(new Rental(movie, 12));

        assertThat("Rental Record for 老王：\n" +
                "\t同桌的你\t100.0\n" +
                "Amount owed is 100.0\n" +
                "You earned 1 frequent renter points").isEqualTo(customer.statement());
    }


}