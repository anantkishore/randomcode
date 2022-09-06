package com.kishore.anant.misc;

/* Problem Name is &&& Largest Tree &&& PLEASE DO NOT REMOVE THIS LINE. */
/*
 **  Instructions:
 **
 **  Given a forest ( one or more disconnected trees ), find the root of largest tree
 **  and return its Id. If there are multiple such roots, return the smallest Id of them.
 **
 **  Complete the largestTree function in the editor below.
 **  It has one parameter, immediateParent, which is a map containing key-value pair indicating
 **  child -> parent relationship. The key is child and value is the corresponding
 **  immediate parent.
 **  Constraints
 **    - Child cannot have more than one immediate parent.
 **    - Parent can have more than one immediate child.
 **    - The given key-value pair forms a well-formed forest ( a tree of n nodes will have n-1 edges )
 **
 **  Example:
 **
 **  Input:
 **  { { 1 -> 2 }, { 3 -> 4 } }
 **
 **  Expected output: 2
 **  Explanation: There are two trees one having root of Id 2 and another having root of Id 4.
 **  Both trees have size 2. The smaller number of 2 and 4 is 2. Hence the answer is 2.
 */

import java.util.Map;

public class LongestTree {
    /*
     **  Find the largest tree.

     { { 1 -> 2 }, {6 -> 2} }
     { 3 -> 4 }, { 5 -> 4 }, { 4 -> 7} }

     */
    public static int largestTree(final Map<Integer, Integer> immediateParent) {


        return 0;


    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     *//*
    public static boolean testsPass() {
        // map of test cases to expected results
        final Map<Map<Integer, Integer>, Integer> testCases = new HashMap<>();

        /*example
        final Map<Integer, Integer> testCaseOneKey = new HashMap<>() {{
            put(1, 2);
            put(3, 4);
        }};
        final Map<Integer, Integer> testCaseTwoKey = new HashMap<>() {{
            put(1, 2);
            put(3, 4);
            put(5, 4);
            put(4, 7);
        }};
        testCases.put(testCaseOneKey, 2);
        testCases.put(testCaseTwoKey, 7);


        boolean passed = true;
        for (var entry : testCases.entrySet()) {
            final int actual = largestTree(entry.getKey());
            if (actual != entry.getValue()) {
                passed = false;
                System.out.printf("Failed for %s%n expected %s, actual %s%n", entry.getKey(), entry.getValue(), actual);
            }
        }

        return passed;
    }*/

    /*
     **  Execution entry point.
     *//*
    public static void main(String[] args) {
        // Run the tests
        if (testsPass()) {
            System.out.println("All tests pass");
        }
        else {
            System.out.println("Tests fail.");
        }
    }*/
}
