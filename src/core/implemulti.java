package core;
 class implemulti implements Runnable {
    public void run(){
        System.out.println("running thread");
    }
    
}
class check{
    
    public static void main(String[] args) {
    implemulti m1=new implemulti();
    Thread t1=new Thread(m1);
    t1.start();
    }
 }