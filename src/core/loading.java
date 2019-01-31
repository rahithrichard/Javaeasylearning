public class loading {
    
    int c;
    int value ( int a){
        System.out.println(a);
        return a;
    }
    int value(int a,int b){
        c=a+b;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
   new loading().value(2,2);
   new loading().value(6);
}
}
