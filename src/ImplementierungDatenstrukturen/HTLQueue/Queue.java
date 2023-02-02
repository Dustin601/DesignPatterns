package ImplementierungDatenstrukturen.HTLQueue;

import ImplementierungDatenstrukturen.HTLQueueList;

public class Queue implements HTLQueueList {
    private Node first;

    @Override
    public void enqueue(int value) {
        Node n = new Node(value);
        first = n;
    }

    @Override
    public void dequeue() {

    }
}
