package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonetTest {

    @Test
    public void testMultiplicationDollar() {

        Money five =  Money.dollar(5);

        Assertions.assertEquals(new Dollar(10,"USD"), five.times(2));
        Assertions.assertEquals(new Dollar(15,"USD"), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        Assertions.assertEquals(new Dollar(5,"USD"),new Dollar(5,"USD"));
        Assertions.assertNotEquals(new Dollar(5,"USD"),new Dollar(6,"USD"));
    }

    @Test
    public void testMultiplicationFranc() {

        Money five = (Franc) Money.franc(5);

        Assertions.assertEquals(new Franc(10,"CHF"), five.times(2));

        Assertions.assertEquals(new Franc(15,"CHF"), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        Assertions.assertEquals(new Franc(5,"CHF"),new Franc(5,"CHF"));
        Assertions.assertNotEquals(new Franc(5,"CHF"),new Franc(6,"CHF"));
        Assertions.assertNotEquals(new Dollar(5,"USD"),new Franc(5,"CHF"));
    }

    @Test
    void testCurrency() {
        Assertions.assertEquals("USD", Money.dollar(1).currency());
        Assertions.assertEquals("CHF", Money.franc(1).currency());
    }

}