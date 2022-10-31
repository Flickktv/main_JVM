public class Messenger implements Runnable{

    @Override
    public synchronized void run() {
        try {
            while(true) {
                Thread.sleep(5000L);
                System.out.printf("Message every 5 secs" + " ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
