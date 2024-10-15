package com.sumit.coding.design_patterns.behavioral.iterator.problem.service;

import java.util.*;

public class Library {

    private List<String> bookList = new ArrayList<>();
    private LinkedList<String> borrowedBooks = new LinkedList<>();
    private Set<String> availableBooks = new HashSet<>();

    public void addBooks() {
        bookList.add("Ramayana");
        bookList.add("Bhagvad Purana");
        borrowedBooks.add("Who moved my cheese?");
        availableBooks.add("200 not out");
        availableBooks.add("Mahabharat");
    }

    public void printBooks() {
        // traverse arraylist
        // Traversing ArrayList
        System.out.println("Books in bookList:");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }

        // Traversing LinkedList
        System.out.println("\nBorrowed books:");
        for (int i = 0; i < borrowedBooks.size(); i++) {
            System.out.println(borrowedBooks.get(i));
        }

        // Traversing Set (No index-based access, need an iterator)
        System.out.println("\nAvailable books:");
        Iterator<String> iterator = availableBooks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
