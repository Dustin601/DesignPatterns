package Sonnenkollektor;

public class main {
    public static void main(String[] args) {
        Sonnenkollektor s = new Sonnenkollektor();
        Laderegler l = new Laderegler(15);
        Geschirrspüler g = new Geschirrspüler(20);
        Heizung h = new Heizung(17);
        h.inform(20);


    }
}
