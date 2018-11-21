package cc.xpbootcamp.helloworld;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {

    @Test
    void should_return_correct_result_when_call_statement() throws Exception {
        Customer customer = new Customer("SJ");

        Rental rental = new Rental(new Movie("奇幻森林", Movie.CHILDREN), 4);
        Rental rental1 = new Rental(new Movie("我不是药神", Movie.NEW_RELEASE), 5);
        Rental rental2 = new Rental(new Movie("速度与激情8", Movie.REGULAR), 6);

        customer.addRental(rental);
        customer.addRental(rental1);
        customer.addRental(rental2);

        String expectResult = "Rental Record for SJ\n\t奇幻森林\t3.0\n\t我不是药神\t15.0\n\t速度与激情8\t8.0\n" +
                "Amount owed is 26.0\nYou earned 4 frequent renter points";

        assertThat(customer.statement()).isEqualTo(expectResult);
    }

}