package guru.springframework;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Franc times(int multiplier) {
        return Money.franc(amount*multiplier);
    }


    @Override
    public String currency() {
        return currency;
    }
}