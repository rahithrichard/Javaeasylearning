package core;
public class fibanocci {
    public static void main(String[] args) {
//        int i;
//        int[] a=new int[10];
//        a[0]=0;
//        a[1]=1;
//        for(i=2;i<10;i++){
//            a[i]=a[i-1]+a[i-2];
//        
//        }
//        for(i=0;i<10;i++){
//            System.out.println(a[i]);
//        }

int a=0;
System.out.println(a);

int b=1;
System.out.println(b);

int temp=0;
for(int i=0;i<10;i++){
int c=a+b;

temp=c;
System.out.println(temp);
a=b;
b=c;
}
    }
    
}
