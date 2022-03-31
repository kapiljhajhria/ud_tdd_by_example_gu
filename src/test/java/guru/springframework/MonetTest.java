package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonetTest {

    @Test
    public void testMultiplication() {

        Money fiveD =  Money.dollar(5);
        Money fiveF =  Money.franc(5);

        Assertions.assertEquals(new Money(10,"USD"), fiveD.times(2));
        Assertions.assertEquals(new Money(15,"USD"), fiveD.times(3));
        Assertions.assertEquals(new Money(10,"CHF"), fiveF.times(2));
        Assertions.assertEquals(new Money(15,"CHF"), fiveF.times(3));
    }

    @Test
    void testEquality() {
        Assertions.assertEquals( Money.dollar(5), Money.dollar(5));
        Assertions.assertNotEquals( Money.dollar(5), Money.dollar(6));

        Assertions.assertNotEquals(Money.franc(5), Money.franc(6));
        Assertions.assertEquals(Money.franc(5), Money.franc(5));

        Assertions.assertNotEquals( Money.franc(5), Money.dollar(5));
    }


    @Test
    void testCurrency() {
        Assertions.assertEquals("USD", Money.dollar(1).currency());
        Assertions.assertEquals("CHF", Money.franc(1).currency());
    }

}