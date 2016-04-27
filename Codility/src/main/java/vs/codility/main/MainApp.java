/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.main;

import vs.codility.training.*;

/**
 *
 * @author Aimee
 */
public class MainApp {

    public static void main(String args[]) {
        int counter = 0;

        System.out.println("the longest binary gap length is : " + BinaryGap.solution(1000101) + " for number 1000101");
        System.out.println("After " + 10 + " rotations New Array is");
        for (int number : CyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 10)) {
            System.out.println("array index " + counter + " is number " + number);
            counter++;
        }
       //hallo
        

        //added a change
        
        String temp [] = {"hey", "hoi"};
        String temp1[] = {"hey", "hoi"};
        
        
        
        
    }

}
