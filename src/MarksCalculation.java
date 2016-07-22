/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class MarksCalculation {
    
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int sci,eng,maths,nep,java;
    System.out.println("Please enter your marks on Science");
    sci=sc.nextInt();
    System.out.println("Please enter your marks on maths");
    maths=sc.nextInt();
    System.out.println("Please enter your marks on english");
    eng=sc.nextInt();
    System.out.println("Please enter your marks on Snepali");
    nep=sc.nextInt();
    System.out.println("Please enter your marks on java");
    java=sc.nextInt();
    
        if(sci>32 || sci>32 || maths>32 || eng>32 || java>32 || nep>32)
        {
                System.out.println("Yo are failed!");
        }
        
        else{
            int total=sci+eng+maths+nep+java;
            System.out.println("Total="+total);
            
            int percentage=(total*100)/500;
            System.out.println("Percentage="+percentage);
        }
    
    
    }
    
}
