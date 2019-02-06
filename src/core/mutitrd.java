package core;
public class mutitrd extends Thread {
        
    public void run(){
        System.out.println("running");
    } 
}

class multi{
    public static void main(String[] args) {
        mutitrd m1=new mutitrd();
       m1.start();
    }
}
