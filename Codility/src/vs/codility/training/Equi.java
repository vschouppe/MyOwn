package vs.codility.training;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author vschouppe
 */
public class Equi {

/**
 *  hey
 */
    public int solution(int A[], int N) {
        // return 3 for [3,2,-5,1]
        int sum_prefix = 0;
        int sum_suffix = 0;
        int i, j;
        for (i = 0; i < N; i++) {
            // Check if is is the equilibrium point
            sum_prefix = 0;
            for (j = 0; j < i; j++) {
                sum_prefix += A[j];
            }
            sum_suffix = 0;
            for (j = i + 1; j < N; j++) {
                sum_suffix += A[j];
                // Compute suffix sum
            }
            if (sum_prefix == sum_suffix) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Equi e = new Equi();
        
        int N= 7;
        int A[] = {-4,2,3,5,-9,6,3,-10};    
        
        
        
        
        int a = e.solution(A,N);
        System.out.println("a is : " + a);

        long l =2;
        long  t = l;
        for (int i=1; i < 31;i++){
            l = l * t;
        }
        System.out.println("l is : " + l);
        System.out.println("2 is : " +Math.pow(2,32));
        
//        4 294 967 296
//        
//        2 147 483 647
        
        int ll[] = {1,2,3};
        System.out.println("ll is : " + ll.length);
        System.out.println("13/2 is " + 13  / 2);
    }
    

}
