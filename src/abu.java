abstract class abu {
    abstract int value();
}
 class newr extends abu{
     int a=10;
     int b=20;
     int value (){
         int c=a+b;
         System.out.println(c);
         return b;
         
     }
     public static void main(String[] args) {
         abu obj=new newr();
         obj.value();
        // new abu().value();
     }
 }
