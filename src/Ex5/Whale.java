package Ex5;

public class Whale extends Fish {
    private int lengthInMeter;

    public Whale(int lengthInMeter) {
        this.lengthInMeter = lengthInMeter;
        this.speed = 90;
    }

    public int getLengthInMeter() {
        return lengthInMeter;
    }

    public void setLengthInMeter(int lengthInMeter) {
        this.lengthInMeter = lengthInMeter;
    }

    public void makeSound() {
        System.out.println("WHOM WHOM WHOM");
    }

    @Override
    public String toString() {
        return "Whale{" +
                "lengthInMeter=" + lengthInMeter +
                ", speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public void draw() {
        System.out.println("       .\n" +
                "      \":\"\n" +
                "    ___:____     |\"\\/\"|\n" +
                "  ,'        `.    \\  /\n" +
                "  |  O        \\___/  |\n" +
                "~^~^~^~^~^~^~^~^~^~^~^~^~");
    }

}
