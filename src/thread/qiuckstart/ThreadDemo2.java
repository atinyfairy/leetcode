package thread.qiuckstart;

/**
 * @author 周意朗
 * Date: 2022/5/16
 * @since JDK 11
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        Thread thread = new Thread(target);
        thread.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread " + i);
        }
    }
}
