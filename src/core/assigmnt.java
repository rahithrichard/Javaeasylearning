package core;
import java.util.Scanner;
public class assigmnt {
//         int Quantity;
//         int Total;
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);  
       Items obj=new Items();
       payment obj1=new payment();
       cancel obj2=new cancel();
    
       int ch=0;
       int ch1=0;
       int n=0;
       
      boolean b2=true; 
       while(b2){
           System.out.println("------Cool Drinks--------");
       System.out.println("__Products__");
       System.out.println("1 : COKE : 25 "+"\n"+"2 : PEPSI : 35 "+"\n"+"3 : SODA : 45");
       ch=s.nextInt();
       int total=0;
       switch(ch){
           case 1:
             obj.coke();
                
                   
                    boolean b1=true;
                    while(b1){
                        System.out.println("1.Buy Coke \n2.Cancel coke ");
                         ch1=s.nextInt();
                   switch (ch1) {
                       case 1:
                         
                           total= obj1.buycoke();
                          break;
                       case 2:
                           obj2.cancoke(total);
                           break;
                       default:break;
                       
                   }
                   System.out.println("press 1 to continue / 0 to exit .");
                  int temp=s.nextInt();
                  if(temp!=1){
                      b1=false;
                  }
                    }
                   
                     break;
                   
               case 2:
                   obj.pepsi();
                    boolean b3=true;
                    while(b3){
                        System.out.println("1.Buy Coke \n2.Cancel coke ");
                         ch1=s.nextInt();
                   switch (ch1) {
                       case 1:
                          total = obj1.buypepsi();
                           break;
                            case 2:
                           obj2.canpepsi(total);
                           break;
                       default:break;
                   }
                      System.out.println("press 1 to continue / 0 to exit .");
                  int temp=s.nextInt();
                  if(temp!=1){
                      b1=false;
                  }
                    }
                   
                     break;
                   
               case 3:
                   obj.soda();
                    boolean b4=true;
                    while(b4){
                        System.out.println("1.Buy Coke \n2.Cancel coke ");
                         ch1=s.nextInt();
                   switch (ch1) {
                       case 1:
                          total = obj1.buysoda();
                           break;
                       case 2:
                           obj2.cansoda(total);
                           break;
                       default:break;
                   }
                         System.out.println("press 1 to continue / 0 to exit .");
                  int temp=s.nextInt();
                  if(temp!=1){
                      b1=false;
                  }
                    }
                   break;
               default:
                   System.out.println("Choose correctly..");
                   break;
           }
        System.out.println("press 1 to Main menu / 0 to exit .");
                  int temp=s.nextInt();
                  if(temp!=1){
                      b2=false;
                  }
    }
    }
    
}

class Items extends assigmnt{
      int price=25;
      int price1=35;
      int price2=45;
    int coke(){
    
     System.out.println("Coke : 25");
     System.out.println("sugar free"+"\n"+"650 ml");
     return price;
    }
    int pepsi(){
    
    System.out.println("Pepsi : 35");
    System.out.println("soft drink"+"\n"+"750 ml");
    return price1;
    }
    int soda(){
    System.out.println("Soda : 45");
    System.out.println("Pure beverage"+"\n"+" 1 Ltr");
    return price2;
    }
}
class payment extends Items{
    Scanner s=new Scanner(System.in);
    int price=25,price1=35,price2=45;
     int Quantity;
         int Total;
    
    int buycoke(){
      System.out.println("Enter Quantity :"); 
      Quantity=s.nextInt();
     Total=Quantity*price;
     System.out.println("---bill----");
     System.out.println("Your total amount : "+Total);
     return Total;   
    }
    int buypepsi(){
         System.out.println("Enter Quantity :");
         Quantity=s.nextInt();
         Total =Quantity*price1;
         System.out.println("---bill----");
         System.out.println("Your total amount : "+Total);
        return Total;
    }
    int buysoda(){
         System.out.println("Enter Quantity :");
         Quantity=s.nextInt();
         Total =Quantity*price2;
          System.out.println("---bill----");
          System.out.println("Your total amount : "+Total);
        return Total;
    }
       
}



class cancel extends payment{
    void cancoke(int total){
        System.out.println("refunt amount :"+total);
       
    }
    void canpepsi(int total){        
        System.out.println("refunt amount :"+total);
        
    }
    void cansoda(int total){
        System.out.println("refunt amount :"+total);
    }
}




class cashtran extends Items {
     int[] value ={1,5,10,25};
         
    int coins(){
   
          int penny=value[0];
          int nickel=value[1];
          int dime=value[2];
          int quarter=value[3];
           return value[4];
    }
           
}

class pay extends cashtran{
  
    int pay(){
        
     return 0; 
    }
}
