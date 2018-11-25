package cc.xpbootcamp.extract_method;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class OrderPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void should_print_correct_order() {
        OrderPrinter orderPrinter = new OrderPrinter("电子产品",
                Arrays.asList(new Order(5), new Order(1.5)));
        orderPrinter.print();
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("****************************************\n");
        expectedOutput.append("*************Customer Owes *************\n");
        expectedOutput.append("****************************************\n");
        expectedOutput.append("name: 电子产品\n");
        expectedOutput.append("amount: 6.5\n");

        assertThat(String.valueOf(outContent)).isEqualTo(expectedOutput.toString());
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }
}