//Create a Simple basic structure of flipkart for using Syncronization


class Flipkart {  //flipkart app

    int laptop = 20;//20 laptop available on app
    
  synchronized void product_buy(int user_reqirement){ //buy the product 
    
    if (laptop >= user_reqirement){//if user reqiurement is less than and equall to product(laptop)

        System.out.println("\n[+] Your Order booked is successfully :) ");

        laptop = laptop-user_reqirement;//then user buy the product successfully the change the product availability

        System.out.println("only "+laptop+" laptop(s) is left");//how many product are left 
    }
    else  {//if the user reqirement more the available product

        System.out.println("\n[+] Product is SOLD OUT, Try after Sometime !!!");
        System.out.println("Reqirement "+user_reqirement+" ,But only "+laptop+" laptop(s) is left");
    }
           }    }
    
    
    
    //booking class extend thread class
    public class booking extends Thread{
    
    static Flipkart product;
     
    int user_reqirement ;//store how many product reqirement to user
    
    public void run (){//Override the thread run method 
        product.product_buy(user_reqirement);//call to product_buy() method 
    }
    
        public static void main(String[] args) throws Exception {
              
            product = new Flipkart();
            booking user_1 = new booking();//create user 1 
            booking user_2 = new booking();//create user 2 
    
            user_1.user_reqirement = 15; //user 1 requirement is 15 laptops 
            user_2.user_reqirement = 13; //user 2 requirement is 13 laptops
    
            user_1.start();
            user_2.start();
    
        }
    }