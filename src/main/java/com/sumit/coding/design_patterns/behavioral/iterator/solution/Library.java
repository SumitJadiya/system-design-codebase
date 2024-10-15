package com.sumit.coding.design_patterns.behavioral.iterator.solution;

import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Collection;
import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.Iterator;
import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl.AvailableBooks;
import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl.BookList;
import com.sumit.coding.design_patterns.behavioral.iterator.solution.service.impl.BorrowedBooks;

public class Library {

    private final Collection bookList = new BookList();
    private final Collection borrowedBooks = new BorrowedBooks();
    private final Collection availableBooks = new AvailableBooks();

    public void addBooks() {
        ((BookList) bookList).addBook("The Great Gatsby");
        ((BookList) bookList).addBook("1984");
        ((BorrowedBooks) borrowedBooks).addBook("Moby Dick");
        ((AvailableBooks) availableBooks).addBook("War and Peace");
        ((AvailableBooks) availableBooks).addBook("Pride and Prejudice");
    }

    public void printBooks() {
        printCollection(bookList.createIterator(), "Books in bookList:");
        printCollection(borrowedBooks.createIterator(), "Borrowed books:");
        printCollection(availableBooks.createIterator(), "Available books:");
    }

    private void printCollection(Iterator iterator, String header) {
        System.out.println("\n" + header);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
