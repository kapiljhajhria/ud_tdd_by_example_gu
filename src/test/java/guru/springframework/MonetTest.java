package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonetTest {

    @Test
    public void testMultiplicationDollar() {

        Dollar five =  Money.dollar(5);

        Assertions.assertEquals(new Dollar(10), five.times(2));
        Assertions.assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        Assertions.assertEquals(new Dollar(5),new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5),new Dollar(6));
    }

    @Test
    public void testMultiplicationFranc() {

        Franc five =  Money.franc(5);

        Assertions.assertEquals(new Franc(10), five.times(2));

        Assertions.assertEquals(new Franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        Assertions.assertEquals(new Franc(5),new Franc(5));
        Assertions.assertNotEquals(new Franc(5),new Franc(6));
        Assertions.assertNotEquals(new Dollar(5),new Franc(5));
    }

}