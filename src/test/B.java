package test;

/**
 * @author 周意朗
 * Date: 2021/9/24
 * @since JDK 11
 */
public class B extends A {
    public B(){
        System.out.println("hello from B");
    }
    {
        System.out.println("this is B");
    }
    static {
        System.out.println("static B");
    }
}
