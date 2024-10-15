package com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl;

import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Iterator;

import java.util.LinkedList;

public class BorrowedBooksIterator implements Iterator {

    private LinkedList<String> books;
    private int position;

    public BorrowedBooksIterator(LinkedList<String> books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Object next() {
        return hasNext() ? books.get(position++) : null;
    }
}
