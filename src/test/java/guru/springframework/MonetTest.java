package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonetTest {

    @Test
    public void testMultiplicationDollar() {

        Money five =  Money.dollar(5);

        Assertions.assertEquals(new Money(10,"USD"), five.times(2));
        Assertions.assertEquals(new Money(15,"USD"), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        Assertions.assertEquals(new Money(5,"USD"),new Money(5,"USD"));
        Assertions.assertNotEquals(new Money(5,"USD"),new Money(6,"USD"));
    }

    @Test
    public void testMultiplicationFranc() {

        Money five =  Money.franc(5);

        Assertions.assertEquals(new Money(10,"CHF"), five.times(2));

        Assertions.assertEquals(new Money(15,"CHF"), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        Assertions.assertEquals(new Money(5,"CHF"),new Money(5,"CHF"));
        Assertions.assertNotEquals(new Money(5,"CHF"),new Money(6,"CHF"));
        Assertions.assertNotEquals(new Money(5,"USD"),new Money(5,"CHF"));
    }

    @Test
    void testCurrency() {
        Assertions.assertEquals("USD", Money.dollar(1).currency());
        Assertions.assertEquals("CHF", Money.franc(1).currency());
    }

}