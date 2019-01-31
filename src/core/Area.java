package core;
public class Area extends triangle {
    public static void main(String[] args) {
       Area obj = new Area();
        obj.area();
        obj.volume();
        obj.areaa();
        obj.areia();
    }
    
}
class circle {
   double pi=3.14;
   int r =10;
  double volume (){
      double circlevolume= (pi*r*r);
      System.out.println("volume of circle = "+circlevolume);
  return circlevolume;
  
  }
}
class square extends circle{
  int b;
    int area(){
        b=super.r;
        int a=b*b;
        System.out.println("Area of Square = "+a);
        return a;
    }
}

class rectangle extends square{
    int h=15;
    int d;
    int f;
    int areaa(){
        d=super.b;
        f=d*h;
        System.out.println("area of rectangle = "+f);
        return f;
    }
    
}

class triangle extends rectangle{
    int t;
    double areia(){
        t=super.f;
       double g=((0.5)*t);
       System.out.println("Area of triangle = "+g);
       return g;
    }
}