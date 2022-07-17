package thread.threadpool;

import java.util.concurrent.Callable;

/**
 * @author 周意朗
 * Date: 2022/6/8
 * @since JDK 11
 */
public class MyCallableForThreadPool implements Callable<String> {
    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName() + "Callable return a number: " + Math.random();
    }
}
