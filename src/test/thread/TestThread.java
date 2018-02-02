public class TestThread {
    public static void main(String[] args) {
        RunnableTicket runnableTicket = new RunnableTicket();
        new Thread(runnableTicket).start();
        new Thread(runnableTicket).start();
        new Thread(runnableTicket).start();

    }
}

class RunnableTicket implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
                System.out.println(Thread.currentThread().getName());
                System.out.println("卖票:ticket:" + this.ticket--);
            }
        }
    }
}