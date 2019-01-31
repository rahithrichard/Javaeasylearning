public class ride {
   String name;
   String drive(){
       name="two wheeler";
       System.out.println("Type :"+name);
       return name;
       
   }
    
}

class Travel extends ride{
   // String name;
    String drive(){
        name="Bike";
        System.out.println(name);
    return name;
    }
    public static void main(String[] args) {
       new Travel().drive();
    }
}
