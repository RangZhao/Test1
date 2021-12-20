package kujiale;

public class T1 {
    public static Integer num=1;
    public static void main(String[] args) {
        num=1;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (T1.class){
                        while (num%2==0){
                            try {
                                T1.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (num<=100){
                            System.out.println(num);
                            num++;
                        }
                        T1.class.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (T1.class){
                        while (num%2==1){
                            try {
                                T1.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (num<=100){
                            System.out.println(num);
                            num++;
                        }
                        T1.class.notifyAll();
                    }
                }
            }
        }).start();
    }
}
