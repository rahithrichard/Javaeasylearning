package core;
import java.util.Scanner;
public class multiarra {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      int tmp;
      System.out.println("Enter row of Matrix 1 :");
      int r=s.nextInt();
        System.out.println("Enter Column of Matrix 1 :");
      int c=s.nextInt();
        int i,j;
        int p,q;
//        int r2 = 0,c2 =0;
       
        int[][] arra;
        arra=new int[r][c];
        int[][] arra2;
        
        
        System.out.println("---Enter Matrix 1 values ---");
        for (i=0;i<r;i++){
            for(j=0;j<c;j++){
            System.out.println("Enter value "+i+j+" :");
            arra[i][j]=s.nextInt();
            }
                }

      
         System.out.println("Enter row of Matrix 2 :");
       int r2=s.nextInt();
        System.out.println("Enter Column of Matrix 2 :");
       int c2=s.nextInt();
         arra2=new int[r2][c2];
        int[][] arra3;
        arra3=new int[r][c2];

           System.out.println("---Enter Matrix 2 values ---"); 
           for(p=0;p<r2;p++){
               for(q=0;q<c2;q++){
                System.out.println("Enter value "+p+q+" :");
                arra2[p][q]=s.nextInt();
               }
               
            }
                      if(c==r2){
                     System.out.println("---Multiplication of Matrix ----");
                     for(i=0;i<r;i++){
                         for(j=0;j<c2;j++){
                             arra3[i][j]=0;
                             for(int k=0;k<c;k++){
                                 arra3[i][j]=arra3[i][j]+arra[i][k]*arra2[k][j];
                             }
                         }
                     }
                     for(i=0;i<c;i++){
                         for(j=0;j<c;j++){
                             System.out.print(arra3[i][j]+" ");
                         }
                         System.out.println(" ");
                             
                     }
                                 }
                           else{
               System.out.println("---your matrixs can't multiple---- "+"\n"+"----ERROR....---");
                                }
               
    }
  
}
