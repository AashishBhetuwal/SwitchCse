package Com.LeapFrog;

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
public class Maximum {
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int choice = 0;
        while (true) { 
        System.out.println("Please enter your choice:");
       
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Maximum");
        System.out.println("6. Minimum");
        System.out.println("7. Power");
        System.out.println("8. Multiplication Table");
         choice=sc.nextInt();
            
                   
            switch(choice){
            
                case 1:{
                    int a,b;
                    System.out.println("Please enter any two numbers:");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    
                    int sum=a+b;
                    System.out.println("Sum=\t"+ sum);
                    break;
                }
                
                case 2:
                {
                    int a,b;
                    System.out.println("Please enter any two numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    int sub=a-b;
                    System.out.println("Subtraction=\t"+sub);
                    break;
                }
                
                case 3:
                {
                    int a,b;
                    System.out.println("Please enter any two numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    int mul=a*b;
                    System.out.println("Multiplication=\t"+mul);
                    break;
 
                }
                
                case 4:
                {
                 int a,b;
                    System.out.println("Please enter any two numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    int div=a/b;
                    System.out.println("Division=\t"+div);
                    break;
                
                }
                
                
                case 5:
                {
                        int a,b,c;
                        System.out.println("Please enter any three numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=sc.nextInt();
                        
                        
                        if(a>b && a>c)
                        {
                            System.out.println(a +"\n\t is the greatest");
                        }
                        
                        else if(b>a && b>c)
                        {
                            System.out.println( b +"\n\t is the greatest");
                        }
                        
                        else
                        {
                                System.out.println(c +"\n\t is the greatest");
                            }
                        break;
                            
                }
            
                
                case 6:
                {
                        int a,b,c;
                        System.out.println("Please enter any three numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=sc.nextInt();
                        
                        
                        if(a<b && a<c)
                        {
                            System.out.println(a +"\n\t is the smallest");
                        }
                        
                        else if(b<a && b<c)
                        {
                            System.out.println( b +"\n\t is the smallest");
                        }
                        
                        else
                        {
                                System.out.println(c +"\n\t is the smallest");
                            }
                        break;
                }
                
                case 7:
                {
                    int a,b;
                    System.out.println("Please enter the base:");
                    a=sc.nextInt();
                    System.out.println("Please enter the power:");
                    
                    b=sc.nextInt();
                    int power=1;
                    for(int i=1;i<=b;i++)
                    {
                        power *=a;
                    }
                    System.out.println(a +"^" +b +"=" +power);
                    break;
                }
                
                case 8:
                {
                    int a,b,c = 0;
                    System.out.println("Please enter first number:");
                    a=sc.nextInt();
                    System.out.println("Please enter second number");
                    b=sc.nextInt();
                    
                    
                    for(  b=1;b<=10;b++)
                    {
                        
                         c=a*b;
                         System.out.println(a + "*" + b + "=" + c);
                         }
               break;
                   
                }
                
                case 9:
                {
                    System.exit(0);
                }
                
                default:
                {
                    System.out.println("Wrong Input!");
                }
                
                
                
           
                    
                   
                    
                
                
            
            }
            
            
                     System.out.println("Do you want to continue?[Y/N]");
                   String am=sc.next();
                    if(am.equalsIgnoreCase("n"))
                    {
                        System.exit(0);
                    }
                
        }
        
        
        
        
    }

    
    
    
}
        
        
        