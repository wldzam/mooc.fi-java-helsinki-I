public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        while (this.balance >= 0) {
            if ((this.balance - 2.5) < 0) {
                break;
            }
            balance -= 2.50;
            break;
        }
    }

    public void payGourmet() {
        while (this.balance >= 0) {
            if ((this.balance - 4) < 0) {
                break;
            }
            balance -= 4.00;
            break;
        }
    }

    public void loadMoney(double money) {
        while (money > 0) {
            this.balance += money;
            if ((this.balance + money) > 150)
                this.balance = 150.0;
            break;
        }
    }
}