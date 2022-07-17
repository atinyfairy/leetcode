package thread.threadpool;

import java.util.concurrent.*;

/**
 * @author 周意朗
 * Date: 2022/6/8
 * @since JDK 11
 * 自定义一个线程池并且测试
 */
public class ThreadPoolWithRunnable {
    public static void main(String[] args) {
        /**
         *  public ThreadPoolExecutor(int corePoolSize,
         *                          int maximumPoolSize,
         *                          long keepAliveTime,
         *                          TimeUnit unit,
         *                          BlockingQueue<Runnable> workQueue,
         *                          ThreadFactory threadFactory,
         *                          RejectedExecutionHandler handler)
         */


        ExecutorService pool = new ThreadPoolExecutor(3,
                5,
                5,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        Runnable target = new MyRunnableForThreadPool();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //开发中一般不使用,这是立即关闭, 还有shotdown()是会等待全部任务完成后关闭
        pool.shutdownNow();
    }
}
