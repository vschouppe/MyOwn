/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training;

import java.util.Arrays;

/*
 A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

 Your goal is to find that missing element.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given a zero-indexed array A, returns the value of the missing element.

 For example, given array A such that:

 A[0] = 2
 A[1] = 3
 A[2] = 1
 A[3] = 5
 the function should return 4, as it is the missing element.

 Assume that:

 N is an integer within the range [0..100,000];
 the elements of A are all distinct;
 each element of array A is an integer within the range [1..(N + 1)].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.

 */
/**
 *
 * @author vschouppe
 */
public class PermMissingElem {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length + 1;
        int size = A.length;
        System.out.println("N = " + n);
        System.out.println("size = " + size);
        // sorting array
        Arrays.sort(A);
        for (int number : A) {
            System.out.println("Number = " + number);
        }

        int mediaanPos = (size/2)-1;
        int half = n/2;
        
        
        System.out.println("mediaan position = " + mediaanPos);
        System.out.println("half = " + half);
        System.out.println("A[mediaanPos] = " + A[mediaanPos]);

        if (A[0] != 1){
            return 1;
        }else if (A[size-1] != n){
            return n;
        } 
        
        if ( half !=  A[(mediaanPos)]) {
            for(int i=0; i < size ;i++){
                if (A[i]+1 != A[i+1]){
                    return A[i]+1;
                }
            }
        } else {
            for(int i=size-1; i > 0 ;i--){
                int first = A[i] -1;
                int sec = A[i-1];
                System.out.println("first= " +first );
                System.out.println("sec= " +sec );
                if (first != sec){
                    return first;
                }
            }
        }
        return 0;
    }

    public static void main(String args[]) {

        int x = 5;
        int array[] = {1};

        PermMissingElem pme = new PermMissingElem();
        int a = pme.solution(array);
        System.out.println("Missing element is : " + a);

    }
}

