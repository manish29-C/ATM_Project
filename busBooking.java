import java.util.Scanner;
class Bus{
    Scanner sc = new Scanner(System.in);

    public void booking(){
        int avSeats = 10;
         
         while(avSeats > 0){
            System.out.println("Enter the seat booker name : ");

            String name = sc.nextLine();
            System.out.println("Hii. " + name + " Enter the number of seats you want to book : ");
            int seats = sc.nextInt();
            sc.nextLine();
             
             if(seats == 0){
                System.out.println("Please enter value greater than 0 ");
             }

             else  if(seats > avSeats){
                System.out.println("Sorry , only " + avSeats + " are available");
            }
            
            else {
                avSeats -= seats;
            
                }
                System.out.println(" Booking successfull " + seats + " seats are booked for " + name + ",");
                System.out.println(" Remaining seats are : " + avSeats);
            }
         }
    }
}
public class busBooking{
    public static void main(String args[]){
     Bus obj = new Bus();
     obj.booking();
    }
}
