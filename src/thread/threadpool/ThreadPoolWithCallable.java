package thread.threadpool;

import java.util.concurrent.*;

/**
 * @author 周意朗
 * Date: 2022/6/8
 * @since JDK 11
 */
public class ThreadPoolWithCallable {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        Future<String> f1 = pool.submit(new MyCallableForThreadPool());
        Future<String> f2 = pool.submit(new MyCallableForThreadPool());
        Future<String> f3 = pool.submit(new MyCallableForThreadPool());
        Future<String> f4 = pool.submit(new MyCallableForThreadPool());
        try {
            String s = f1.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
