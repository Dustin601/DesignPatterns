package Sonnenkollektor;

public class Geschirrspüler extends AbstractObserver {
    public Geschirrspüler(int minVoltage) {
        super(minVoltage);
    }

    @Override
    public void callOut(STATE state) {
        if (state == STATE.ON){
            System.out.println("Enough Voltage, Geschirrspüler is now active");
        } else{
            System.out.println("Not enough Voltage, Geschirrspüler is now inactive");
        }
    }
}
