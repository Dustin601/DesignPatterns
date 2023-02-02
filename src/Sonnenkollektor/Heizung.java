package Sonnenkollektor;

public class Heizung extends AbstractObserver {
    public Heizung(int minVoltage) {
        super(minVoltage);
    }

    @Override
    public void callOut(AbstractObserver.STATE state) {
        if (state == AbstractObserver.STATE.ON){
            System.out.println("Enough Voltage, Heizung is now active");
        } else{
            System.out.println("Not enough Voltage, Heizung is now inactive");
        }
    }
}
