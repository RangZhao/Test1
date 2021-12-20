package D1;

public class Test implements Runnable{
    @Override
    public void run() {
        while (true) {
            synchronized (Test.class) {
                num++;
                if (num > 100) break;
                System.out.println(Thread.currentThread().getName() + ": " + num);
            }
        }
    }

    static volatile int num=0;

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (Test.class) {
                        while (num%3!=0){
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        num++;
                        if (num > 100) break;
                        System.out.println(Thread.currentThread().getName() + ": " + num);

                    }
                    notifyAll();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (Test.class) {
                        while (num%3!=1){
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        num++;
                        if (num > 100) break;
                        System.out.println(Thread.currentThread().getName() + ": " + num);
                    }
                    notifyAll();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (Test.class) {
                        while (num%3!=2){
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        num++;
                        if (num > 100) break;
                        System.out.println(Thread.currentThread().getName() + ": " + num);
                    }
                    notifyAll();
                }
            }
        }).start();
    }
}
