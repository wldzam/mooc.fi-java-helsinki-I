public class Counter {
    private int startValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this();
        this.startValue = startingValue;
    }

    public Counter(boolean check) {
        this();
        this.check = check;
    }

    public Counter() {
        this.startValue = 0;
        this.check = false;
    }

    // Methods below:
    public int value() {
        return this.startValue;
    }

    public void increase() {
        startValue++;
    }

    public void decrease() {
        if (this.check == true) {
            startValue--;
            if (startValue < 0) {
                startValue = 0;
            }
        } else {
            startValue--;
        }
    }

    // Overloaded methods

    public void increase(int increaseAmount) {
        if (this.check == true && increaseAmount > 0) {
            startValue += increaseAmount;
            if (startValue < 0) {
                startValue = 0;
            }
        } else if (increaseAmount > 0){
            startValue += increaseAmount;
        }
    }

    public void decrease (int decreaseAmount) {
        if (this.check == true && decreaseAmount > 0) {
            startValue -= decreaseAmount;
            if (startValue < 0) {
                startValue = 0;
            }
        } else if (decreaseAmount > 0){
            startValue -= decreaseAmount;
        }
    }


}
