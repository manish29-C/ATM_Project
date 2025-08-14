class Bus321 extends Thread{
    int avalTickets = 5;
     int passenger;
    Bus321(int a){
       passenger = a;
    }
     public void run(){
        String name = Thread.currentThread().getName();
        if(avalTickets > passenger){
              System.out.println(name+" Seats are booked");
              avalTickets -= passenger;
        }
        else{
                System.out.println(name + " Sorry less number of tickets are available");
        }
     }
}
public class YCCE_321{
    public static void main(String args[]){
      Bus321 obj = new Bus321(3);
      Thread t1 = new Thread(obj);
      Thread t2 = new Thread(obj);
      Thread t3 = new Thread(obj);

      t1.setName("Sarang");
      t2.setName("Himanshu");
      t3.setName("Sahil");

      t1.start();
      t2.start();
      t3.start();
    }

}