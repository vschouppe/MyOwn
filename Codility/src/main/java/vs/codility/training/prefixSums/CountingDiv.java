/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Write a function:

class Solution { public int solution(int A, int B, int K); }
that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }
For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Assume that:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
Complexity:

expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).

 */
package vs.codility.training.prefixSums;

/**
 *
 * @author Aimee
 */
public class CountingDiv {

    public int solution(int A, int B, int K) {
        // write your code in Java SE 8

        int closestSmallMod = 0, closestLargeMod = 0, counter = 0, result = 0;
        boolean foundSmall = false, foundLarge = false;
        if (A == B) {
            if (A % K == 0) {
                return 1;
            }
        } else if (K > B) {
            return 0;
        } else {
            // calculate the closest small Mod
            counter = 0;
            while (foundSmall == false) {
                if ((A + counter) % K == 0) {
                    closestSmallMod = A + counter;
                    foundSmall = true;
                    break;
                }
                counter++;
            }
            // calculate the closest largest Mod
            counter = 0;
            while (foundLarge == false) {
                if ((B - counter) % K == 0) {
                    closestLargeMod = B - counter;
                    foundLarge = true;
                    break;
                }
                counter++;
            }
            if (closestLargeMod != closestSmallMod) {
                result = ((closestLargeMod - closestSmallMod) / K) + 1;
            } else {
                result = 1;
            }
        }
        return result;
    }
}
