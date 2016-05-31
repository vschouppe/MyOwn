/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.

Write a function:

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
the function should return 1, as explained above. Given array A such that:

  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1
the function should return 0.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.


 */
package vs.codility.sorting;

/**
 *
 * @author Aimee
 */
public class Triangle {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int l = A.length;
        int largest = 0;

        //first we sort the array using count sort
        //get largest
        for (int i : A) {
            if (i > largest) {
                largest = i;
            }
        }
        //set all elements of c to 0
        int c[] = new int[largest + 1];
        int b[] = new int[A.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }
        printc(c, "c");
        // set occurences of each element in c
        for (int i : A) {
            c[i] += 1;
        }
        printc(c, "c");
        // add 
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i - 1] + c[i];
        }
        printc(c, "c");

        for (int i = A.length-1; i >= 0; i--) {
            int value = A[i];
            int cvalue = c[value] - 1;
            b[cvalue] = value;
            c[value] = cvalue;
        }
        printc(b, "b");

        
        
        return 0;
    }

    public void printc(int[] c, String name) {
        System.out.println("for " + name + " is ");
        for (int i : c) {
            System.out.print(i);
        }
        System.out.println();
    }

}
