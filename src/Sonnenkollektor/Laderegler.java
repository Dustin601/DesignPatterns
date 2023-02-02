package Sonnenkollektor;

public class Laderegler extends AbstractObserver{
    public Laderegler(int minVoltage) {
        super(minVoltage);
    }

    @Override
    public void callOut(AbstractObserver.STATE state) {
        if (state == AbstractObserver.STATE.ON){
            System.out.println("Enough Voltage, Laderegler is now active");
        } else{
            System.out.println("Not enough Voltage, Laderegler is now inactive");
        }
    }
}
