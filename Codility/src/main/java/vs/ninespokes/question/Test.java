/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.ninespokes.question;

/**
 *
 * @author Aimee
 */
public class Test {

    
    public static void main (String args[]){
        char[] ch = {'a','b','c','3','7'};
        
        for (int i=0; i<ch.length/2;i++){
            char cTemp = ch[i];
            ch[i] = ch[ch.length - i -1];
            ch[ch.length - i -1 ] = cTemp;
        }
        for (char a : ch){
                System.out.println("a:" + a);
        }
    }    
}
