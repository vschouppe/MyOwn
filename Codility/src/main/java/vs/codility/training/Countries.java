package vs.codility.training;


import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vschouppe
 */
public class Countries {

    
    public int solution(int[][] A) {
        // write your code in Java SE 8

        int arrayl = A.length;
        int countryCounter = 0;
        Set<Integer> set = new HashSet<Integer>(0);

        System.out.println("array length is   : " + arrayl);

        for (int c = 0; c < arrayl; c++ ){
                    System.out.println("Row  : " + c);
            for (int i=0; i < A[c].length;i++) {
                
                    System.out.println("Col  : " +i);
                System.out.println("number  : " + i);
                set.add(A[c][i]);
            }
        }
        
        for (int a: set){
            System.out.println("set contains : " + a);
        }

        return set.size();
    }

    public static void main(String args[]) {

        int A[][] = new int[7][3];
        A[0][0] = 5;
        A[0][1] = 4;
        A[0][2] = 4;
        
        A[1][0] = 4;
        A[1][1] = 3;
        A[1][2] = 4;
        
        A[2][0] = 3;
        A[2][1] = 2;
        A[2][2] = 4;
        
        A[3][0] = 2;
        A[3][1] = 2;
        A[3][2] = 2;
        
        A[4][0] = 3;
        A[4][1] = 3;
        A[4][2] = 4;
        
        A[5][0] = 1;
        A[5][1] = 4;
        A[5][2] = 4;
        
        A[6][0] = 4;
        A[6][1] = 1;
        A[6][2] = 1;

        Countries c = new Countries();
        int r = c.solution(A);
        System.out.println("the amount of countries in A is   : " + r);
    }

}
