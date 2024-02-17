
//import all package 
import dhruv.kumar.*;

public class checkpackage {
    public static void main(String[] args) {

//using circle class 
    Circle c =  new Circle(5);
    double k = c.area();
    double l = c.perimeter();
    System.out.println("the perimeter and area of Circle is :" +l +" & "+k);
   
//using rectangle class 
    rectangle r = new rectangle(5,3);
    double n = r.area();
    double m = r.perimeter();
    System.out.println("the perimeter and area of Rectangle is :" +m +" & "+n);

   //using Cylinder class  
    Cylinder cy = new Cylinder(5,5);
    double t = cy. tsa();
    double s =  cy .csa ();
    System.out.println("the CSA and TSA of Cylinder is :" +s +" & "+t);


//using Square class 
    Square sq = new Square(8);
    double ar = sq.area();
    double pr = sq.perimeter();

    System.out.println("the perimeter and area of Square is :" +pr +" & "+ar);

 
    }
     
 
 }
 