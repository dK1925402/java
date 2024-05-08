class other{

  int count;// create count variable
  synchronized void increase(){//this method only used for increase the count ;
  count++;//count=count+1;
                              }
}

//Syncronization class extends thread
public class synchronization extends Thread {

static other obj ;//This is the type of the variable obj. It refers to the class named other that you've defined.
    
public void run(){//@override the thread class run method

        for(int j = 0;j<1000;j++){//this loop run 1000 times and call to obj.increase() method 
        obj.increase();   }
                                          }

    //Start main method and throws Exception because use join()                                      
    public static void main(String[] args) throws Exception{
        
        obj = new other();//This assigns the newly created instance of the other class to the static variable obj.
        //  So, obj now holds a reference to this newly created object.


    //create a two object t1 & t2 of synchronization class
    synchronization t1 = new synchronization();
    synchronization t2 = new synchronization();

    //start the thread 
     t1.start();
     t2.start();
     
     //use join because allows one thread to wait for the completion of another.
     t1.join();
     t2.join();

     //print the count variable
     System.out.println(obj.count);
     
    }
}