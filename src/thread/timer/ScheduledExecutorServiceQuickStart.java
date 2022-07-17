package thread.timer;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 周意朗
 * Date: 2022/6/8
 * @since JDK 11
 */
public class ScheduledExecutorServiceQuickStart {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " time A: " + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " time B: " + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}
