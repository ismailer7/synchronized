import java.io.*;

class ThreadSend extends Thread {

    private String msg;
    // private Thread t;
    Sender sender;


    public ThreadSend(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        /*synchronized(this.sender) {
            // this is the critical zone (one thread at time should use this block)
            this.sender.send(this.msg);
        }*/
        this.sender.send(this.msg);

    }

}