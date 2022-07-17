package base;

import org.junit.Test;

import java.util.ArrayList;
import java.util.BitSet;

/**
 * @author 周意朗
 * Date: 2021/8/12
 * @since JDK 11
 * 求质数
 */
public class PrimeNumber {

    /**
     * 埃拉托色尼筛选法(the Sieve of Eratosthenes)简称埃氏筛法
     * https://baike.baidu.com/item/%E5%9F%83%E6%8B%89%E6%89%98%E8%89%B2%E5%B0%BC%E7%AD%9B%E9%80%89%E6%B3%95
     *
     * @param n 最大数的大小,求到n为止
     * @return 在n范围内的所有质数
     */
    public static ArrayList<Integer> theSieveOfEratosthenes(int n) {

        BitSet bitSet = new BitSet(n + 1);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int i;
        for (i = 2; i <= n; i++) {
            bitSet.set(i);
        }

        i = 2;
        while (i * i <= n) {
            if (bitSet.get(i)) {
                arrayList.add(i);
                int k = i * i;
                while (k <= n) {
                    bitSet.clear(k);
                    k += i;
                }
            }
            i++;
        }

        while (i <= n) {
            if (bitSet.get(i)) {
                arrayList.add(i);
            }
            i++;
        }
        return arrayList;
    }

    public static void iDo(int n) {
        Boolean[] res = new Boolean[n + 1];
        res[0] = res[1] = false;
        for (int i = 2; i <= n; i++) {
            res[i] = true;
        }
        //i代表整数及其下表,j代表正在处理的j的倍数,从2开始到j*k<n
        int i;
        int j;

        for (i = 2; i <= n; i++) {
            if (res[i]) {
                for (j = 2; i * j <= n; j++) {
                    res[i * j] = false;
                }
            }
        }

        for (int k = 2; k <= n; k++) {
            if (res[k]) {
                System.out.print(k + " ");
            }
        }
    }

    @Test
    public void test(){
//        iDo(20);
        System.out.println(theSieveOfEratosthenes(20));
    }
}
