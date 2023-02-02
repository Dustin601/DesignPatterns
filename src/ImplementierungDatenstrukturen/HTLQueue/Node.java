package ImplementierungDatenstrukturen.HTLQueue;

public class Node {
    private int value;
    private Node previous;


    public Node(int value){
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }
}
