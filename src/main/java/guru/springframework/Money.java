package guru.springframework;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract Money times(int multiplier);

    public static Dollar dollar(int multiplier) {
        return new Dollar(multiplier, "USD");
    }

    public static Franc franc(int multiplier) {
        return new Franc(multiplier, "CHF");
    }


    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(object.getClass());
    }

    public abstract String currency();
}