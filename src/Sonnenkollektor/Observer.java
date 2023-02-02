package Sonnenkollektor;

public interface Observer {
    public void inform(int Voltage);
    void callOut(AbstractObserver.STATE state);
}
