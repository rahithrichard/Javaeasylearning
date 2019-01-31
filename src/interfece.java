interface check{
    int value();
}
interface junk{
    String name();
}

public class interfece implements check,junk{
    int value =10;
    String name ="rahith";
    public int value(){
        System.out.println(value);
        return value;
    }
       public String name(){
        System.out.println("\n"+name);
        return name;
    
        
    }
    public static void main(String[] args) {
       new interfece().value();
       new interfece().name();
    }
}