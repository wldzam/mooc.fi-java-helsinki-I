public class Bird {

    private String birdName;
    private String latinBirdName;
    private int timesObserved;

    public Bird(String birdName, String latinBirdName) {
        this.birdName = birdName;
        this.latinBirdName = latinBirdName;
        this.timesObserved = 0;
    }

    public String getBirdName() {
        return birdName;
    }

    public void birdSpotted() {
        timesObserved++;
    }

    @Override
    public String toString() {
        return birdName + " (" + latinBirdName + "): " + timesObserved + " observations";
    }
}
