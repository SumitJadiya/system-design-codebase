package com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl;

import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Iterator;

import java.util.Set;

public class AvailableBooksIterator implements Iterator {

    private java.util.Iterator<String> iterator;

    public AvailableBooksIterator(Set<String> books) {
        this.iterator = books.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }
}
