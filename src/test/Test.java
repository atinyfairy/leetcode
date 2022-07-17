package test;

/**
 * @author 周意朗
 * Date: 2021/9/24
 * @since JDK 11
 */
public class Test {

    String s = new String("good");
    char[] ch = {'a', 'b', 'c'};
    int a = 2;

    public static void main(String[] args) {

        Test test = new Test();
        test.change(test.s, test.ch, test.a);
        System.out.println(test.s);
        System.out.println(test.ch);
        System.out.println(test.a);
    }

    public void change(String str, char[] ch,int a ) {
        str = " test ok";
        ch[0] = 'g';
        a = 3;
    }

}
