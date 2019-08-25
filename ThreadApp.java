

public class ThreadApp {

    public static void main(String[] args) {
        
        Sender sender = new Sender();

        ThreadSend ts1 = new ThreadSend("Hello", sender);
        ThreadSend ts2 = new ThreadSend("Bye", sender);

        ts1.start();
        ts2.start();

        try {
            ts1.join();
            ts2.join();
        } catch (Exception e) {
            System.out.println("Interrupted!");
        }

    }

}