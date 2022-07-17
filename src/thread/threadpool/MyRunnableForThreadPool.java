package thread.threadpool;

/**
 * @author 周意朗
 * Date: 2022/6/8
 * @since JDK 11
 */
public class MyRunnableForThreadPool implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "=======>" + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + " now thread sleep 10 seconds");
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
