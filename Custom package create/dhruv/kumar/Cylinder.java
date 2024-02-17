package dhruv.kumar;

public class Cylinder  extends Shape {
   public Cylinder(int dim1,int dim2){
        super (dim1,dim2);
    }

public double csa (){
    return 2*Math.PI*dim1*dim2;
}

public double  tsa (){
    return 2*Math.PI*dim1*(dim1+dim2);
}

}