package Dog;

public class WufWuf implements BarkStrategy{
    @Override
    public void bark() {
        System.out.println("WufWuf");
    }
}
