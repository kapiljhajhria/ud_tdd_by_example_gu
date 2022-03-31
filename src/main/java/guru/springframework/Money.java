package guru.springframework;

public abstract class Money {

    protected int amount;

    public abstract Money times(int multiplier);

    public static Dollar dollar(int multiplier){
        return new Dollar(multiplier);
    }

    public static Franc franc(int multiplier){
        return new Franc(multiplier);
    }


    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(object.getClass());
    }

}