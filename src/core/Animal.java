package core;
public class Animal {
    void dispay(){
    String size = "Small";
    String look = "Cute";
    System.out.println(size+" and "+look);
}
}

class dog extends Animal{
   static String name ="Dog";
    public static void main(String[] args) {
        dog obj=new dog();
        System.out.println(name);
         obj.dispay();
    }
}
