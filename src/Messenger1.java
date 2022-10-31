public class Messenger1 implements Runnable{

    @Override
    public synchronized void run() {
        try {
            while(true) {
                Thread.sleep(7000L);
                System.out.printf("Message every 7 secs" + " ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}