class looping extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Bye");
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
public class multiThread {

    public static void main(String args[]) {
        looping op = new looping();
        op.start();

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello");
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

    }
}