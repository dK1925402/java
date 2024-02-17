package dhruv.kumar;

public class Square   extends Shape {
    public Square(int dim1){
        super(dim1,0);

    }

    public int  area (){
        return 4*dim1;
    }

    public int  perimeter (){
        return   dim1 *dim1;
    }
}
