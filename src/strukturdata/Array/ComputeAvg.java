/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata.Array;

import java.util.Scanner;

/**
 *
 * @author Faa
 */
public class ComputeAvg {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int [] score = new int [5];
        
        System.out.println("masukkan angka: ");
        for (int i = 0 ; i < score.length; i++){
            score [i] = input.nextInt();
        }
        
        System.out.println();
        
        int total = 0;
        
        for (int i = 0; i < score.length; i++){
           
            total = total +score [1];
        }
        
        System.out.println("Total:");
        System.out.println(total);
        
        double ave = total/score.length;
        System.out.println("Rata-rata bilangan:" + ave);
    }
    
    
}
