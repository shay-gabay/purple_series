package Ex5;

public class Shark extends Fish {

    private int numOfTeeth;

    public Shark(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
        this.speed = 120;
    }

    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "numOfTeeth=" + numOfTeeth +
                ", speed=" + speed +
                "} " + super.toString();
    }

    public void makeSound() {
        System.out.println("Yummy Yummy Yummy");
    }

    @Override
    public void draw() {
        System.out.println(" _________         .    .\n" +
                "(..       \\_    ,  |\\  /|\n" +
                " \\       O  \\  /|  \\ \\/ /\n" +
                "  \\______    \\/ |   \\  / \n" +
                "     vvvv\\    \\ |   /  |\n" +
                "     \\^^^^  ==   \\_/   |\n" +
                "      `\\_   ===    \\.  |\n" +
                "      / /\\_   \\ /      |\n" +
                "      |/   \\_  \\|      /\n" +
                "             \\________/");
    }
}
