package thread.qiuckstart;

/**
 * @author 周意朗
 * Date: 2022/5/16
 * @since JDK 11
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        //这里开始,就有2个线程在抢资源
        thread.start();
        System.out.println("main start");

        for (int i = 0; i < 5; i++) {
            System.out.println("This is the " + i + " time of main thread.");
        }
        System.out.println("main end");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("child start");
        for (int i = 0; i < 5; i++) {
            System.out.println("This is the " + i + " time of child thread.");
        }
        System.out.println("child end");

    }
}