package Dog;

public class Puddel extends AbstractDog{

    public Puddel(String name, BarkStrategy bark) {
        super(name, bark);
    }

    @Override
    public void run() {
        System.out.println("Ich bin ein Puddel und heiße: " + getName());
        this.bark.bark();
    }
}
