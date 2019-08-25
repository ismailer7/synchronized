class Sender {

    public void send(String msg) {
        System.out.println("Sending  " + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(msg + "Send!");
    }

}