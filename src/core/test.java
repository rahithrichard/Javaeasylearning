package core;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j;
        int n=1;
        int u=0;
        int k=0;
        int m=1;
        int v=0;
        int[] check;
        check =new int[5];
        int[] store;
        store = new int[5];
        for(i=0;i<5;i++){
            System.out.println("Enter value of array "+n);
            check[i]=s.nextInt();
            n++;
        }
        
        for (i=0;i<5;i++){
            for(j=m;j<5;j++){
                if(check[i]==check[j]){
                   System.out.println("item found"+check[i]+" equals "+check[j]);
                   u=0;
                    }
                else{
                    u=1;
                }
               
                }
            m++;
        }
        if (u==0){
            System.out.println("item found");
        }
        else{
           u=1;
           System.out.println("item not found");
       }
        
//            for(i=0;i<5;i++){
//                for(j=m;j<5;j++){
//                    if(check[i]!=check[j]){
//                        v=1;
//                    }
//                    else{
//                        v=0;
//                    }
//                    
//                }
//                if(v==1){
//                    
//                store[k]=check[i];
//                System.out.println("gjsacjc");
//                }
//                        k++;
//                m++;
//                 
//            }
//            
//            for(i=0;i<5;i++){
//                System.out.println(store[i]);
//            }
        }
    }
    

