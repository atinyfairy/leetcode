package thread.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 周意朗
 * Date: 2022/6/8
 * @since JDK 11
 * Timer 是单线程的, 如果一个Timer处理2个任务, 那么可能会出现问题
 * 比如一个占用时间长于另外一个的等待时间
 * 比如一个线程出现问题, 那么其他的任务都会被异常停止
 */
public class TimerQuickStart {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }, 3000, 2000);
    }
}
