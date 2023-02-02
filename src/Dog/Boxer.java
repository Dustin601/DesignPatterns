package Dog;

public class Boxer extends AbstractDog{


    public Boxer(String name, BarkStrategy bark) {
        super(name, bark);
    }

    @Override
    public void run() {
        System.out.println("Ich bin ein Boxer und heiße: " + getName());
        this.bark.bark();
    }
}
