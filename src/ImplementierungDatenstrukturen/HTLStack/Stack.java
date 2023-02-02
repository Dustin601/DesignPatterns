package ImplementierungDatenstrukturen.HTLStack;

import ImplementierungDatenstrukturen.HTLStackList;


public class Stack implements HTLStackList {
    private Node top;

    @Override
    public void push(int value) {
        top = new Node(value, top);
    }

    @Override
    public void pop() {
        if(top == null){
            return;
        } else{
            top = top.getPrevious();
            return;
        }

    }

    @Override
    public int peak() {
        Node actual = top;
        return actual.getValue();
    }
}
