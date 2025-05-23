public class Battery {

    private int capacityMAh;
    private boolean isCharged = false;

    public Battery(int capacityMAh) {
        this.capacityMAh = capacityMAh;
    }

    public void charge() {
        this.isCharged = true;
    }

    public boolean isCharged() {
        return this.isCharged;
    }

    public int getCapacityMAh() {
        return this.capacityMAh;
    }

    @Override
    public String toString() {
        return "Battery: " + this.capacityMAh + " mAh, Charged: " + isCharged();
    }

}