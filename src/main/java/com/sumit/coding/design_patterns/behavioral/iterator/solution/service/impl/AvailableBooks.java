package com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl;

import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Collection;
import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Iterator;

import java.util.HashSet;
import java.util.Set;

public class AvailableBooks implements Collection {
    private Set<String> books = new HashSet<>();

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator createIterator() {
        return new AvailableBooksIterator(books);
    }
}
