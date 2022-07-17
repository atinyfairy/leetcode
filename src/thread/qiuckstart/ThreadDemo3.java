package thread.qiuckstart;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 周意朗
 * Date: 2022/5/16
 * @since JDK 11
 * Thread : Callable & FutureTask
 * Thread or Runnable can not return a value
 * that is why Callable and FutureTask are here
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //Callable is a task, not a thread
        Callable<String> callable = new MyCallable(10);
        //take Callable to FutureTask as a constructor. As FutureTask implements Runnable so it can be handled to Thread
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            String s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<String> {

    private int i;

    public MyCallable(int i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        int j;
        for (j = 0; j < i; j++) {
            j += i;
            System.out.println("j: " + j);
        }
        return "value is " + j;
    }
}
