/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.LeapFrog.StringArray;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class StringArray {
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

    String[] subjects = {"java", "english", "nepali"};
    double[] marks = new double[subjects.length];
    
        for (int i=0;i<=subjects.length;i++){
            System.out.println(subjects[i]);
            marks[i]=sc.nextDouble();
        }
        
    }

  

    

   

}
