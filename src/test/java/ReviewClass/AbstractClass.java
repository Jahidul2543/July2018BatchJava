package Review;


abstract class Bike{
   abstract void run();
   // Bike objBike = new Bike() ;
            public void whell(){
                System.out.println("");
            }
}

class Honda4 extends Bike{
    void run(){
        System.out.println("running safely..");
    }

    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}
