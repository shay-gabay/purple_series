package Ex4;

public class App {
    public static void main(String[] args) {
        DogGarden dogGarden = new DogGarden(DogFactory.initDogGarden());
        System.out.println(dogGarden);
    }
}
