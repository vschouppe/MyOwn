/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

 Count the minimal number of jumps that the small frog must perform to reach its target.

 Write a function:

 class Solution { public int solution(int X, int Y, int D); }

 that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

 For example, given:

 X = 10
 Y = 85
 D = 30
 the function should return 3, because the frog will be positioned as follows:

 after the first jump, at position 10 + 30 = 40
 after the second jump, at position 10 + 30 + 30 = 70
 after the third jump, at position 10 + 30 + 30 + 30 = 100
 Assume that:

 X, Y and D are integers within the range [1..1,000,000,000];
 X ≤ Y.
 Complexity:

 expected worst-case time complexity is O(1);
 expected worst-case space complexity is O(1).
 Copyright 2009–2016 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
package vs.codility.training;

/**
 *
 * @author vschouppe
 */
public class FrogJmpThreadTest1 {

    public static void main(String arg[]) {

        Thread t1 = new Thread() {
            public void run() {
                FrogJmp fj = new FrogJmp();
                int X = 0, Y = 1000000000, D = 2;

                System.out.println("t1 result " + fj.solution(X, Y, D));
                //do stuff    
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                FrogJump2 fj2 = new FrogJump2();
                int X = 0, Y = 1000000000, D = 2;

                System.out.println("t2 result " + fj2.solution2(X, Y, D));
                //do stuff    
            }
        };

        t1.start();
        t2.start();
        System.out.println("all threads started");
    }

}
