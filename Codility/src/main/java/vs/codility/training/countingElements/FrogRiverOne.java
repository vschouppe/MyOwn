/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 A small frog wants to get to the other side of a river. The frog is currently located at position 0, and wants to get to position X. Leaves fall from a tree onto the surface of the river.

 You are given a non-empty zero-indexed array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

 The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X. You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

 For example, you are given integer X = 5 and array A such that:

 A[0] = 1
 A[1] = 3
 A[2] = 1
 A[3] = 4
 A[4] = 2
 A[5] = 3
 A[6] = 5
 A[7] = 4
 In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

 Write a function:

 class Solution { public int solution(int X, int[] A); }

 that, given a non-empty zero-indexed array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

 If the frog is never able to jump to the other side of the river, the function should return −1.

 For example, given X = 5 and array A such that:

 A[0] = 1
 A[1] = 3
 A[2] = 1
 A[3] = 4
 A[4] = 2
 A[5] = 3
 A[6] = 5
 A[7] = 4
 the function should return 6, as explained above.

 Assume that:

 N and X are integers within the range [1..100,000];
 each element of array A is an integer within the range [1..X].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(X), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 */
package vs.codility.training.countingElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author vschouppe
 */
public class FrogRiverOne {

    private static Object ThreadLocalRandom;

    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        int array[] = A.clone();

//        System.out.println("BEFORE");
//        for (int n : A) {
//            System.out.println("array number  : " + n);
//        }
        Arrays.sort(array);
        try {
            Set<Integer> set = new HashSet<Integer>();
            Set<Integer> numberSet = new HashSet<Integer>();
            for (int i = 1; i <= X; i++) {
                numberSet.add(i);
            }
            for (int n : array) {
                set.add(n);
            }
            TreeSet ts = new TreeSet<Integer>(set);
            System.out.println("ts: " + ts);
            if (ts.containsAll(numberSet)) {
//                frog can cross river
                ArrayList<Integer> al = new ArrayList<Integer>();
                for (int n : A) {
                    al.add(n);
                }
                int lastBridge = 0;
                for (int n : numberSet) {
                    int res = al.indexOf(n);
                    System.out.println("index of " + n + " is " + res);
                    if (lastBridge < res) {
                        lastBridge = res;
                    }
                }
                return lastBridge;
            }
        } catch (Exception e) {
            System.out.println("message: " + e.getLocalizedMessage());
        }

        return -1;
    }

    public static void main(String args[]) {

        int x = 220;
        int size =100000;
//        int array[] = {1, 3, 1, 1, 1, 1, 2, 3, 5, 3, 3};
        int array[] = new int[size];

        for (int i = 1; i < size; i++) {
            array[i]= i;
        }
        
        
        FrogRiverOne fr1 = new FrogRiverOne();
        fr1.ShuffleArray(array);
        int a = fr1.solution(x, array);
        System.out.println("Seconds to cross are: " + a);

    }

    // Implementing Fisher–Yates shuffle
    private void ShuffleArray(int[] array) {
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                array[index] ^= array[i];
                array[i] ^= array[index];
                array[index] ^= array[i];
            }
        }
    }

}
