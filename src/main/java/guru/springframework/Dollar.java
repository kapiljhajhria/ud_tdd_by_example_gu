package guru.springframework;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Dollar times(int multiplier) {
        return Money.dollar(amount*multiplier);
    }

    @Override
    public String currency() {
        return this.currency;
    }
}