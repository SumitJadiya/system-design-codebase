package com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl;

import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Collection;
import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Iterator;
import lombok.Setter;

import java.util.LinkedList;

public class BorrowedBooks implements Collection {

    @Setter
    private LinkedList<String> books = new LinkedList<>();

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator createIterator() {
        return new BorrowedBooksIterator(books);
    }
}
