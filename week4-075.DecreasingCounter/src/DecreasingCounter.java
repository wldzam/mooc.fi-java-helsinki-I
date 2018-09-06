public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        while (this.value > 0) {
            this.value--;
            break;
        }
    }

    public void setInitial() {
        this.value = initValue;
    }

    public void reset() {
        this.value = 0;
    }

    // and here the rest of the methods
}
