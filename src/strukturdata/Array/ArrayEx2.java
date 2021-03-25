/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata.Array;

/**
 *
 * @author Faa
 */
public class ArrayEx2 {
    
    public static void main(String[] args) {
        String [] browsers = new String [4];
        browsers [0] = "explorer";
        browsers [1] = "chrome";
        browsers [2] = "opera";
        browsers [3] = "firefox";
        
        System.out.println(browsers.length);
        for(String i : browsers){
            System.out.println(i);
        }
    
    }
}
   
