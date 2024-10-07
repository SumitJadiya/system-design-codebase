package com.sumit.coding.design_patterns.structural.composite.solution;

import com.sumit.coding.design_patterns.structural.composite.solution.component.ArithmeticExpression;
import com.sumit.coding.design_patterns.structural.composite.solution.component.FileSystemComponent;
import com.sumit.coding.design_patterns.structural.composite.solution.component.impl.Number;
import com.sumit.coding.design_patterns.structural.composite.solution.component.impl.*;

public class MainClass {
    public static void main(String[] args) {

        /* Example One */
        Directory movieDirectory = new Directory("Movie");

        FileSystemComponent border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

        System.out.println("-------------------------------------------------");

        /*Example 2*/
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression addExpression = new Expression(one, seven, Operation.ADD);
        ArithmeticExpression multiplyExpression = new Expression(two, addExpression, Operation.MULTIPLY);

        System.out.println("[2 * ( 1 + 7 )] : " + multiplyExpression.evaluate());
    }
}
