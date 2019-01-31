package core;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class riskone {
    String a;
    int b;
    int Quantity = 0;
    int c=0;
    int newQuantity=0;
    static String f;
    Scanner s=new Scanner(System.in);
    String item() {
        System.out.println("Enter item Name :");
        String name = s.next();
         a = name;
        System.out.println("Enter item Quantity :");
         Quantity = s.nextInt();
         b = Quantity;
        System.out.println("Emter item price :");
        int price = s.nextInt();
        c = price;
        String d = ("item : " + a + " " + "Quantity : " + b + " " + "Price : " + c + "\n");
        return d;
    }
    String buy(){
        System.out.println("item :");
        String name=s.next();
        String a=name;
        System.out.println("Pices :");
        int pices=s.nextInt();
        int n=pices;
        Quantity=Quantity-n;
        newQuantity=Quantity;
        Quantity=newQuantity;
        int total=n*c;
        f= ("item :"+a+"  "+"Quantity :"+n+" "+"Amount :"+total);
        return f;
    }
    void detail(){
        System.out.println("item :"+a);
        System.out.println("Quantity :"+Quantity);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ch = 0;
        riskone obj = new riskone();
        while (ch != 3) {
            System.out.println("-----E KART----");
           System.out.println("1. Add item\n2. Buy product\n3. Details\n4. Print\n");
            System.out.println("choose your option :");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    String d = obj.item();
                    System.out.println(d);
                    try {
                        FileOutputStream fops =new FileOutputStream("abc.txt");
                        byte[] b=d.getBytes();
                        fops.write(b);
                        fops.close();
                        System.out.println("Success");
                    }
                    catch(Exception e){
                        System.out.println(e);

                    }
                    break;
                case 2:
                    String a = obj.buy();
                    System.out.println(a);
                    //String f = obj.buy();
                    //System.out.println(f);
                    break;
                case 3:
                    obj.detail();
                    break;
                case 4:
                    obj.detail();
//                    obj.buy();
                    System.out.println(f);
                    int i;
                    try{
                        FileInputStream obj1=new FileInputStream("abc.txt");
                        while((i=obj1.read())!=-1){
                            System.out.print((char)i);
                        }
                        obj1.close();
                    }
                    catch(Exception e){
                        System.out.println(e);

                    }
                    break;

                default:
                    System.out.println("internal error");
                    break;
            }

        }
    }

}
