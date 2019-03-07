package zan12;

public class DopZadanie3 {
    private static class SampleRunnable implements Runnable {
        private String threadId;
        private Object lock1;
        private Object lock2;

        public SampleRunnable(String threadId, Object lock1, Object lock2) {
            super();
            this.threadId = threadId;
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            try {
                synchronized (lock1) {
                    System.out.println(threadId + " inside lock1");
                    Thread.sleep(1000);
                    synchronized (lock2) {
                        System.out.println(threadId + " inside lock2");
                    }
                }
            } catch (Exception e) {
            } finally {
                System.out.println("finally");
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Object ob1 = new Object();
        Object ob2 = new Object();
        Thread t1 = new Thread(new SampleRunnable("t1", ob1, ob2));
        Thread t2 = new Thread(new SampleRunnable("t2", ob2, ob1));
        t1.start();
        t2.start();
    }
}