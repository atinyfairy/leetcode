package thread.synchronizedmethod;

/**
 * @author 周意朗
 * Date: 2022/5/16
 * @since JDK 11
 */
public class MySynchronizedMethod {
    //同步代码块
    public static void synchronizedMtheod(){
        //静态方法通过字节码(类)来实现
        synchronized (MySynchronizedMethod.class) {

        }
    }
    //普通方法锁this
    public void method(){
        synchronized (this) {

        }
    }


    //同步方法
    public synchronized void synchronizedMethod2(){


    }
}
