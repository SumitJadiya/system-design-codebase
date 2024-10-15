package com.sumit.coding.design_patterns.behavioral.iterator.problem;

import com.sumit.coding.design_patterns.behavioral.iterator.problem.service.Library;

public class MainClass {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBooks();
        library.printBooks();
    }
}

/*
 * Problems with this Code:
 *
 *    1. Different Traversal Logic: Each collection (ArrayList, LinkedList, and Set) requires different traversal logic:
 *        •	ArrayList uses an indexed for loop.
 *        •	LinkedList also uses an indexed for loop (even though it’s less efficient for LinkedList).
 *        •	Set requires an Iterator as it doesn’t support index-based access.
 *    2. Tightly Coupled to Collection Types: The printBooks method is tightly coupled to the type of each collection. If the type of collection changes (e.g., if bookList becomes a Set), you would have to rewrite the traversal code.
 *    3. Hard to Maintain and Extend: If you add more collection types, you’ll need to implement new traversal logic for each one, making the code harder to maintain and extend.
 *    4. Code Duplication: The logic for iterating over different collections is duplicated. The concept of iteration is the same (traversing elements), but you’re writing different code for each collection type.
 * */