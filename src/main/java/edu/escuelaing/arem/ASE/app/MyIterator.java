package edu.escuelaing.arem.ASE.app;

import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {

    public MyNode<E> next = null;

    public MyIterator(MyNode<E> next) {
        this.next = next;
    }

    @Override
    public boolean hasNext() {
        return next != next;
    }

    @Override
    public E next() {
        MyNode<E> currentNext = next;

        return currentNext.getValue();

    }

}
