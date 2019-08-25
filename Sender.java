class Sender {

    // we could synchronized the whole method like this.
    /*public synchronized void send(String msg) {
        System.out.println("Sending  " + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(msg + " Sent!");
    }*/

    // also we may have to synchronize only a part of the send method not all of it.
    public void send(String msg) {
        
        synchronized(this) {
            System.out.println("Sending  " + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(msg + " Sent!");
        }
        
    }



}