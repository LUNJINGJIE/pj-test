public class Single {
    private static Single s = null;

    public Single() {
    }

    public static Single getInstance() {
        if (s == null) {
            synchronized (Single.class) {
                if (s == null) {
                    s = new Single();
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
    }
}

class myThread implements Runnable {

    @Override
    public void run() {
        Single s = Single.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + s);
    }
}
