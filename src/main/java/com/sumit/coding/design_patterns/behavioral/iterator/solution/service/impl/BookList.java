package com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl;

import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Collection;
import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookList implements Collection {

    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator createIterator() {
        return new BookListIterator(books);
    }
}
