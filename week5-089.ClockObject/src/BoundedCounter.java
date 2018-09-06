public class BoundedCounter {

    private int value = 0;
    private int upperLimit;

    public int getValue() {
        return value;
    }


    public BoundedCounter(int upLimit) {
        this.upperLimit = upLimit;
    }


    public void setValue(int value) {
        while (true) {
            if (value > this.upperLimit || value < 0) {
                this.value = 0;
            } else {
                this.value = value;
            }
            break;
        }
    }


    public void next() {
        while (value <= upperLimit) {
            value++;
            break;
        }

        if (value > upperLimit) {
            value = 0;
        }
    }


    public String toString() {
        return "" + String.format("%02d", this.value);
    }
}