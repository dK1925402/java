/// Create a Loop using function calling 

// class extends with Thread for using sleep fn 
public class program extends Thread {

    static int a ;//declare static variable 
    
    static void infiniteLoop() throws Exception{ //create infinite loop fn and throws Exception because we using sleep()
    
                     
    System.out.println(a);    //print a 
    a= a+1;                   // add 1 in a (a=a+1)
    Thread.sleep(5);          //sleep for 2 mili second 
    infiniteLoop();           // recall the function and creating infinite loop

}

//main method
    public static void main(String[] args)throws Exception{
      
        infiniteLoop();//first call to fn 

    }
}
