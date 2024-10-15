package com.sumit.coding.design_patterns.behavioral.iterator.solution;


public class MainClass {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBooks();
        library.printBooks();
    }
}

/*
 *  Key Improvements:
 *
 *	1.	Uniform Traversal: The printCollection method is now generic and can handle any collection by simply using the Iterator. We don’t need separate traversal logic for different collections anymore.
 *	2.	Loose Coupling: The Library class no longer depends on the specific types of the collections. If the underlying collection type changes, the client code won’t need modification.
 *	3.	Maintainability: If we introduce a new collection type, we simply need to implement a new iterator for it, and the rest of the code remains unchanged.
 *	4.	Extensibility: Adding new collections or modifying traversal behavior (like supporting reverse traversal) is easy by creating new iterator implementations.
 *	5.	No Code Duplication: The traversal logic is centralized in the iterator classes, avoiding the duplication of similar logic.
 * */