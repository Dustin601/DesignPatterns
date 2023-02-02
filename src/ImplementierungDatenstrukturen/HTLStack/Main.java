package ImplementierungDatenstrukturen.HTLStack;

public class Main {
    public static void main(String[] args) {
        Stack sl = new Stack();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        sl.push(5);
        System.out.println(sl.peak());
        sl.pop();

    }
}
