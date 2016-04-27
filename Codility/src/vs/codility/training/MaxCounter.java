/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training;

/**
 * Codility logo trainingTGU82Q-AXS 01:01:30 Settings Language    Programming language    
Task description
You are given N counters, initially set to 0, and you have two possible operations on them:

increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.
A non-empty zero-indexed array A of M integers is given. This array represents consecutive operations:

if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.

Write a function:

class Solution { public int[] solution(int N, int[] A); }

that, given an integer N and a non-empty zero-indexed array A consisting of M integers, returns a sequence of integers representing the values of the counters.

The sequence should be returned as:

a structure Results (in C), or
a vector of integers (in C++), or
a record Results (in Pascal), or
an array of integers (in any other programming language).
For example, given:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2], as explained above.

Assume that:

N and M are integers within the range [1..100,000];
each element of array A is an integer within the range [1..N + 1].
Complexity:

expected worst-case time complexity is O(N+M);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

Copyright 2009–2016 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
Custom test cases		
Solution


1
2
3
4
5
6
7
8
9
10
11
// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
    }
}
Java SE 8All changes saved.Keyboard shortcuts
HELP  RUN  SUBMIT THIS TASK  QUIT
↑Output console
accessibility mode is disabled
 */


/**
 *
 * @author Aimee
 */
public class MaxCounter {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int value = 0;
        int[] result = new int[N];
        int counter = 0;
        int maxcounter = 0;
        for (int c = 0; c < N; c++) {
            result[c] = 0;
        }

        for (int number : A) {
            //if value of input field is = N+1 then all array colums should be increased
            counter = 0;
            if (number == N + 1) {
                for (int v : result) {
                    System.out.println("increase result[counter] " + result[counter]);
                    result[counter] = maxcounter;
                    counter++;
                }
            } //otherwise the field (number-1) should be increased with 1
            else {
                System.out.println("result[number - 1]: " + result[number - 1]);
                result[number - 1] = result[number - 1] + 1;
                System.out.println("result[number - 1] altered: " + result[number - 1]);
                if (result[number - 1] > maxcounter){
                    maxcounter = result[number - 1];
                }
                System.out.println("maxcounter: " + maxcounter);
            }
        }
        return result;
    }

}
