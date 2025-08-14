import java.util.*;
import java.text.*;

class Account_AIML{
    Scanner sc = new Scanner(System.in);
 DecimalFormat DF1 = new DecimalFormat("###,##0.00 'Rupees'");
    private int CN;
    private int b;

    double CB = 2000;
    double SB = 5000;
     void set_Customer_Number(int a){
      
        CN = a;
     }
     void set_PIN_Number(int b){
        this.b=b;
     }
        int get_Customer_Number(){
            return CN;
        }
        int get_PIN_Number(){
        return b;
        }
        void getCurrentBalance(){
           System.out.println("Current account balance : " + DF1.format(CB));

        }
        void getSavingBalance(){
            System.out.println("Saving account balance : " + DF1.format(SB));
        }
        
        void getCurrentWithdrawInput(){
            
            System.out.println("\nCurrent account balance : " + DF1.format(CB));
            System.out.println("Enter the amount you want to withdraw : ");
            double amount = sc.nextDouble();
            if((CB-amount) >= 0){
               calci_CurrentWithdraw(amount);
               System.out.println("\nTranscation Successfull");
               System.out.println("Current Account Balance : " + DF1.format(CB));
            }
            else{
                 System.out.println("\n Insufficient Balance");
            }
        }
        double calci_CurrentWithdraw(double amount){
            CB = CB - amount;
            return CB;
        }
        void getSavingWithdrawInput(){
           System.out.println("\nSaving account balance : " + DF1.format(SB));
            System.out.println("Enter the amount you want to withdraw : ");
            double amount = sc.nextDouble();
            if((SB-amount) >= 0){
               calci_SavingWithdraw(amount);
               System.out.println("\nTranscation Successfull");
               System.out.println("Saving Account Balance : " + DF1.format(SB));
            }
            else{
                 System.out.println("\nInsufficient Balance");
            }
        }
        double calci_SavingWithdraw(double amount){
            SB = SB - amount;
            return SB;
        }

      void getCurrentDepositeAmount(){
        System.out.println("\nCurrent account balance : " + DF1.format(CB));
            System.out.println("Enter the amount you want to deposite : ");
            double amount = sc.nextDouble();
            if((CB+amount) >= 0){
               calci_CurrentDeposite(amount);
               System.out.println("\nTranscation Successfull");
               System.out.println("Current Account Balance : " + DF1.format(CB));
            }
            else{
                 System.out.println("\n Insufficient Balance");
            }
        }
        double calci_CurrentDeposite(double amount){
            CB = CB + amount;
            return CB;
      }
}
    
class Option_Menu_AIML extends Account_AIML{
Scanner sc = new Scanner(System.in);
HashMap<Integer,Integer> data = new HashMap();
void get_login(){
    do{
        try{
    data.put(11111,111);
    data.put(11112,222);
    data.put(11113,333);
    data.put(11114,444);
    data.put(11115,111);
  System.out.println("Welcome to the AIML");
  System.out.println("Enter the Customer Number:");

  set_Customer_Number(sc.nextInt());
    System.out.println("Enter the Pin Number:");
    set_PIN_Number(sc.nextInt());
    int P=get_Customer_Number();
    int Q=get_PIN_Number();
    if(data.containsKey(P) && data.get(P)==Q)
    {
        get_AccountType();
    }   
    else
    {
        System.out.println("Wrong Customer Number or Pin Number");

    }
}
    catch(InputMismatchException obj)
    {
      System.out.println("\nPlease Enter only Numbers");
      System.out.println("Characters and Symbols are not allowed");
      sc.nextInt();
      get_login();
    }

    } while(true);
}
 void get_AccountType()
 {
    System.out.println("\nSelect the Account Type you want to Access");
    System.out.println("\nType 1: Current Account");
    System.out.println("Type 2: Saving Account");
    System.out.println("Type 3 : Exit");
    System.out.println("Choice : ");

    int ch=sc.nextInt();
    switch(ch)
    {
        case 1 : getCurrent();
           System.out.println("you have selected Current Account");
        break;
        case 2 :getSaving();
         System.out.println("You have selected Saving Account");
        break;
        case 3 : System.out.println("Thank you for using AIML ATM");
        System.out.println("Visit Again");
        break;
        default : System.out.println("Invalid Choice");
        System.out.println("Please Enter the Valid Choice");
        get_AccountType();
        break;
    }
 }
 void getCurrent(){
    System.out.println("\nYou're in the CURRENT ACCOUNT");
    System.out.println("\nType 1 : Check Balance");
    System.out.println("\nType 2 : Withdraw Money");
    System.out.println("\nType 3 : Deposite Money");
    System.out.println("\nEXIT");
    System.out.print("\nChoice : ");
    int ch = sc.nextInt();
    switch(ch){
       case 1 : getCurrentBalance();
                get_AccountType();
        break;
       case 2 : getCurrentWithdrawInput();

        break;
       case 3 :getCurrentDepositeAmount();
        break;
       case 4 :
        System.out.println("Thank you for using AIML ATM");
        System.out.println("Visit Again");
         break;
       default:
       System.out.println("Invalid Choice");
        System.out.println("Please Enter the Valid Choice");
        getCurrent();
        break;
    }
    
     }
     void getSaving(){
         System.out.println("\nYou're in the SAVING ACCOUNT");
    System.out.println("\nType 1 : Check Balance");
    System.out.println("\nType 2 : Withdraw Money");
    System.out.println("\nType 3 : Deposite Money");
    System.out.println("\nEXIT");
    System.out.print("\nChoice : ");
    int ch = sc.nextInt();
    switch(ch){
       case 1 : getSavingBalance();
                get_AccountType();
        break;
       case 2 : getSavingWithdrawInput();
        break;
       case 3 :
        break;
       case 4 :
        System.out.println("Thank you for using AIML ATM");
        System.out.println("Visit Again");
         break;
       default:
       System.out.println("Invalid Choice");
        System.out.println("Please Enter the Valid Choice");
       getSaving();
       break;
    }
     }
public class ATM_AIML extends Option_Menu_AIML{

    public static void main(String[] args){

   Option_Menu_AIML obj = new Option_Menu_AIML();

      obj.get_login();
    }
}
}