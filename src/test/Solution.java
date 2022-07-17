package test;

/**
 * @author 周意朗
 * Date: 2021/10/28
 * @since JDK 11
 * 有一份数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class Solution {
    public float sum() {
        float lower = 1;
        float upper = 2;
        float swap;
        float element;
        float sum = 0;
        for (int i = 0; i < 20; i++) {
            element = upper / lower;
            sum = sum + element;
            swap = upper;
            upper = lower + upper;
            lower = swap;
        }
        return sum;
    }
}
