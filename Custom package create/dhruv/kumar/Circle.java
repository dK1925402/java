package dhruv.kumar;

public class Circle  extends Shape {
   public Circle(int dim1){
        super (dim1,0);
    }

public double area (){
    return Math.PI*dim1*dim1;
}

public double perimeter (){
    return 2*Math.PI*dim1;
}

}
