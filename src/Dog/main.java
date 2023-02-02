package Dog;

public class main {
    public static void main(String[] args) {
        BarkStrategy s1 = new WUUUF();
        BarkStrategy s2 = new WufWuf();
        Boxer b1 = new Boxer("Charlie", s1);
        Puddel p1 = new Puddel("Mark",s2);
        b1.run();
        p1.run();
    }
}
