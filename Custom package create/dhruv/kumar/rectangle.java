
package dhruv.kumar;

public class rectangle extends Shape {
    public rectangle(int dim1,int dim2){
        super (dim1,dim2);
    }

public int area (){
    return dim1*dim2;
}

public int perimeter (){
    return 2*(dim1+dim2);
}

}