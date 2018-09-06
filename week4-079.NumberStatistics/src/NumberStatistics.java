public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        int amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.sum += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }

    public int sum() {
        // code here
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return this.sum;
        }
    }

    public double average() {
        // code here
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return (double)this.sum/this.amountOfNumbers;
        }
    }
}