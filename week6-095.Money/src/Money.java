
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {

        Money sumMoney = new Money(euros + added.euros, cents + added.cents);
        return sumMoney;
    }

    public boolean less(Money compared) {

        boolean result = false;
        if (this.euros < compared.euros) {
            result = true;
        } else if (euros == compared.euros && cents < compared.cents) {
            result = true;
        }
        return result;
    }

    public Money minus(Money decremented) {

        Money resultObject = new Money(0, 0);

        if (this.less(decremented)) {
            Money decrementedMoney = new Money(0, 0);
            resultObject = decrementedMoney;
        } else if (euros > decremented.euros && cents > decremented.cents){
            Money decrementedMoeny = new Money(euros - decremented.euros,cents - decremented.cents);
            resultObject = decrementedMoeny;
        } else {
            Money decrementedMoeny = new Money(euros - decremented.euros - 1,
                    100 - cents - decremented.cents);
            resultObject = decrementedMoeny;
        }

        return resultObject;

    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
