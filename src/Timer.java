public class Timer implements Runnable{

    @Override
    public synchronized void run() {
        int count = 0;
        try {
            while(true) {
                count++;
                wait(1000L);
                System.out.println(count + "." + (System.currentTimeMillis() / 1000));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
