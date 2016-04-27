/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training.countingElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author vschouppe
 */
public class PermCheck {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int array[] = A.clone();
        int lA = A.length;
        int lS = 0;
        ArrayList<Integer> perm = new ArrayList<Integer>();

        Arrays.sort(array);
        Set<Integer> set = new HashSet<Integer>();
        for (int n : array) {
            set.add(n);
        }

        lS = set.size();
        System.out.println("lS :" + lS);
        System.out.println("lA :" + lA);
        if (lS == lA) {
//            length of the original array is = to size of the ordened/non duplicate set
            //        fill perm list with numbers
            for (int i = 1; i <= lS; i++) {
                perm.add(i);
            }
//            for (int i : perm) {
//                System.out.println("Perm :" + i);
//            }
            if (set.containsAll(perm)) {
                result = 1;
            }
        }

        return result;
    }

    public static void main(String args[]) {

        int size = 500000;
        int array[] = new int[size];

        for (int i = 100; i < size; i++) {
            array[i] = i+1;
        }
        PermCheck pc = new PermCheck();
        pc.ShuffleArray(array);
        int a = pc.solution(array);
        System.out.println("Permutation: " + a);

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
