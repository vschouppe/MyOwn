/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training;

/**
 *
 * @author vschouppe
 */
public class BinaryGap {

    public static int solution(int N) {
        int lbg = 0;
        String bn = Integer.toString(N, 2);
        if (!bn.contains("0") || !bn.contains("1")) {
            return lbg;
        }

//        System.out.println("BN : " + bn);
        String splittedL[] = bn.split("1");

        if (splittedL.length < 2 && !bn.endsWith("1")) {
            return lbg;
        }

//        System.out.println("length: " + splittedL.length);
        
        int l = splittedL.length ;
        if (!bn.endsWith("1")){
            l = splittedL.length-1;
        }
        for (int i = 1; i < l; i++) {
//            System.out.println("splittedL[i] : " + splittedL[i] + " with length " + splittedL[i].length());
            if (splittedL[i].length() > lbg) {
                lbg = splittedL[i].length();
            }
        }
        return lbg;
    }

    public static void main(String args[]) {

        int number = 42200000;
        int lbg = 0;
        BinaryGap bg = new BinaryGap();
        lbg = bg.solution(number);
//        System.out.println("the longest binary gap length is : " + lbg + " for number " + number);

//        test();
    }

    public static void test() {
        int number = 9;
        int lbg = 0;
        BinaryGap bg = new BinaryGap();
        bg = new BinaryGap();
        lbg = bg.solution(number);
        System.out.println("TEST");
        System.out.println("====");
        System.out.println("Binary eqivalent of " + number + "is " + Integer.toString(number, 2));
        if (lbg == 2) {
            System.out.println("correct result for number 9");
        } else {
            System.out.println("incorrect result for number 9");
        }
    }

}
