
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMENT = 4;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public void setCashInRegister(double givenMoney) {
        this.cashInRegister += givenMoney;
    }

    public void sellEconomical() {
        this.economicalSold++;
    }

    public void sellGourment() {
        this.gourmetSold++;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= PRICE_OF_ECONOMICAL) {
            setCashInRegister(PRICE_OF_ECONOMICAL);
            sellEconomical();
            return cashGiven - PRICE_OF_ECONOMICAL;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= PRICE_OF_GOURMENT) {
            setCashInRegister(PRICE_OF_GOURMENT);
            sellGourment();
            return cashGiven - PRICE_OF_GOURMENT;
        } else {
            return cashGiven;
        }
    }

    // charging a card methods

    public boolean payEconomical(LyyraCard card) {
        // if amount of money on a card >= PRICE_OF_ECONOMICAL
        //     amount of sold lunches increased by one
        //     return true
        // else return false
        if (card.getBalance() >= PRICE_OF_ECONOMICAL) {
            sellEconomical();
            card.pay(PRICE_OF_ECONOMICAL);
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.getBalance() >= PRICE_OF_GOURMENT) {
            sellGourment();
            card.pay(PRICE_OF_GOURMENT);
            return true;
        } else {
            return false;
        }
    }

    // loading money to Lyyra card

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            setCashInRegister(sum);
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
