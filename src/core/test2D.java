package core;
import java.util.Scanner;
public class test2D {
    public static void main(String[] args) {
        int i,j;
        int x,y;
        int[][] arra;
        arra =new int[3][3];
        Scanner s=new Scanner(System.in);
         for(i=0;i<3;i++){
             for(j=0;j<3;j++){
                 System.out.println("enter value of "+i+j+" :");
                 arra[i][j]=s.nextInt();
             }
         }
         System.out.println("-----your Matrix is Ready...-----");
         for(x=0;x<3;x++){
             for(y=0;y<3;y++){
                 System.out.print(arra[x][y]+" ");
             }
             System.out.println(" ");
             
         }
    }
    
}
