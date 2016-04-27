package vs.codility.training;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vschouppe
 */
import java.util.Arrays;

public class Quasi {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int qs = 1;
        int longestQs = 1;
        int arrayl = A.length;
        double ampl = 0;
        double sumAmpl = 0.0;
        Arrays.sort(A);
        int i = 0;
        int remain = arrayl;
        int start = 0;
        int finalStart = 0;
        int endpoint = 0;
        //loop through array till 1 before last
        for (int c = 0; c < arrayl - 1; c++) {
            System.out.println("loop through array!!");
            System.out.println("counter: " + c);
            // if the quasi is already bigger then the remaining arraylist length loop can stop
            sumAmpl = 0;
            qs = 1;
            if (longestQs < arrayl - c) {
                System.out.println("qc: " + qs);
                System.out.println("counter: " + c);
                System.out.println("remain: " + remain);
                // Check all the amplitudes and add them up to know the quasi of this
                while (start < arrayl - 1) {
                    ampl = A[start + 1] - A[start];
                    sumAmpl += ampl;

                    System.out.println("A[start+1]: " + A[start + 1] + " and A[start] " + A[start]);
                    if (sumAmpl <= 1) {
                        qs++;
                    } else {
                        endpoint = start;
                        break;
                    }
                    start++;
                }
            } else {
                break;
            }
            start = c + 1;
            if (longestQs < qs) {
                longestQs = qs;
                finalStart = c;
            }
        }
        while (finalStart < endpoint) {
            System.out.println("Longest quasi is: " + A[finalStart]);
            finalStart++;

        }
        return longestQs;
    }

    public static void main(String args[]) {

//        int[] array = {6, 10, 6, 9, 7, 8};
//        int[] array = {4,4,3,3,3,2};
//        int[] array = {3,3,3,7,7,7,7,7,11,111111,22222,2222,2,2,2,2,2,22,2,2,2,2,2,2,2,2};
        int[] array = {1};
        Quasi q = new Quasi();
        int r = q.solution(array);
        System.out.println("Length of the longest quasi is  : " + r);
    }

}
