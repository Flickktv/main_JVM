public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        new Thread(timer).start();
        Messenger messenger = new Messenger();
        new Thread(messenger).start();
        Messenger1 messenger1 = new Messenger1();
        new Thread(messenger1).start();

    }
}
