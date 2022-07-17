package thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author 周意朗
 * Date: 2022/6/8
 * @since JDK 11
 * 尽量不要用这个模板去创建, 模板都不灵活
 */
public class ThreadPoolWithExecutors {
    public static void main(String[] args) {
        /**
         * 都允许Integer.Max的请求队列长度, 可能会  Out Of Memory 异常
         */
        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        /**
         * 都允许Integer.Max的线程数量, 可能会  Out Of Memory 异常
         */
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        ExecutorService service = Executors.newCachedThreadPool();

    }
}
