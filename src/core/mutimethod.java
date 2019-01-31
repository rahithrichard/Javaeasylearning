/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
public class mutimethod 
{
    int add(int a,int b)
    {
        int c=a+b;
        return c;  
    }
    int sub(int a,int b)
    {
        int c=a-b;
        return c;
    }
    int mul(int a,int b)
    {
        int c=a*b;
        return c; 
    }
    int div(int a,int b)
    {
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        mutimethod obj=new mutimethod();
        int value=obj.add(12,15);
        System.out.println("Addition ="+" "+value);
        int out=obj.sub(15,9);
        System.out.println("substractio ="+" "+out);
        int result=obj.mul(16,16);
        System.out.println("multiplication ="+" "+result);
        int correct=obj.div(15,5);
        System.out.println("division ="+" "+correct);
        
        
    }
}


