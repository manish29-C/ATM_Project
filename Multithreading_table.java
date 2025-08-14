import java.util.*;
import java.lang.*;

class Table extends Thread
{
    int n;
    Table(int a)
    {
         n =a;
    }
    public  void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }

    }
    public void print(){
        
    }
}

public class Multithreading_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        Table tb1 = new Table(a);
        Table tb2 = new Table(b);


        Thread t1 = new Thread(tb1);
        Thread t2 = new Thread(tb2);

        t1.start();
        t2.start();
    }
    
}