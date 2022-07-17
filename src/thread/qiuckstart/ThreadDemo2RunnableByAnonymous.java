package thread.qiuckstart;

/**
 * @author 周意朗
 * Date: 2022/5/16
 * @since JDK 11
 */
public class ThreadDemo2RunnableByAnonymous {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("i0 :" + i);
            }
        };
        Runnable runnable1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("i1 :" + i);
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
    }
}
