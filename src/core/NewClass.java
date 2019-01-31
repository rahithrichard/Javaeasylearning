/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Scanner;

public class NewClass {
    int add(int a,int b){
        int c=a+b;
        return c;   
    }
    int sub(int a,int b){
        int c=a-b;
        return c;
    }
    int mul(int a,int b){
        int c=a*b;
        return c;
    }
    int div(int a,int b){
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
      String ch=""; int ans=0;
        do{
    
        NewClass n=new NewClass();
        System.out.println("1.addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n");
        System.out.println("choose your option = ");
        Scanner s=new Scanner(System.in);
        ans=s.nextInt();
                System.out.println("Enter value 1");
        int value1=s.nextInt();
                System.out.println("Enter value 2");
        int value2=s.nextInt();
       
        switch (ans){
            case 1:int add=n.add(value1,value2);
            System.out.println("Addition = "+add);
            break;
            case 2:int sub=n.sub(value1,value2);
            System.out.println("Subtraction = "+sub);
            break;
             case 3:int mul=n.mul(value1,value2);
            System.out.println("Multiplication = "+mul);
            break;
             case 4:int div =n.div (value1,value2);
            System.out.println("Division = "+div);
            break;
        }
             System.out.println("Do you want continue(Y/N) ");
         ch=s.next();
    }while(ch.equalsIgnoreCase("y"));
    
    }
}
