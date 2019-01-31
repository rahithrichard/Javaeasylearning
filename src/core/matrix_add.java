package core;
import java.util.Scanner;
public class matrix_add {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      int tmp;
        int i,j;
        int p,q;
        int[][] arra;
        arra=new int[3][3];
        int[][] arra2;
        arra2=new int[3][3];
        int[][] arra3;
        arra3=new int[3][3];
        
        System.out.println("---Enter Matrix 1---");
        for (i=0;i<3;i++){
            for(j=0;j<3;j++){
            System.out.println("Enter value "+i+j+" :");
            arra[i][j]=s.nextInt();
            }
        }

           System.out.println("---Enter Matrix 2---"); 
           for(p=0;p<3;p++){
               for(q=0;q<3;q++){
                System.out.println("Enter value "+p+q+" :");
                arra2[p][q]=s.nextInt();
               }
               
            }
           System.out.println("---Your Matrix Adding please Wait....---");
           
              
           
           for(i=0;i<3;i++){
               for(j=0;j<3;j++){
                   arra3[i][j]=arra[i][j]+arra2[i][j];
               }
           }
           System.out.println("Press 1 to Continue ");
       
           tmp=s.nextInt();
           if (tmp==1){
               System.out.println("----ADDED----");
           for(i=0;i<3;i++){
               for(j=0;j<3;j++){
                   System.out.print(arra3[i][j]+" ");
                }
               System.out.println(" ");
            }
           }
           
           else{
               System.out.println("invalid");
       }
    }
}   

