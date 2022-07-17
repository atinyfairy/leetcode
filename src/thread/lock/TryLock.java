package thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 周意朗
 * Date: 2022/5/16
 * @since JDK 11
 */
public class TryLock {
    private final Lock lock = new ReentrantLock();

    public void method() {
        lock.lock();
        try {
            int i = 1 + 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
