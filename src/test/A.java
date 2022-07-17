package test;

/**
 * @author 周意朗
 * Date: 2021/9/24
 * @since JDK 11
 */
public class A {
    public A(){
        System.out.println("hello from A");
    }
    {
        System.out.println("this is A");
    }
    static {
        System.out.println("static A");
    }
}
