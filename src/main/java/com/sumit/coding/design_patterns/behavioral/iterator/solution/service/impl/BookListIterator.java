package com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl;

import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookListIterator implements Iterator {

    List<String> books;
    private int position;

    public BookListIterator(List<String> books) {
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
