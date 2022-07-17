package cards.arrays;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/9/16
 * @since JDK 11
 */
public class Solution7 {
    public static int[] plusOne(int[] digits) {
        int k = digits.length - 1;
        while(k>=0){
            if(digits[k]!=9){
                digits[k]=digits[k]+1;
                return digits;
            }else{
                digits[k]=0;
                k--;
            }
        }
        int[] res = new int[digits.length+1];
        res[0]=1;
        return res;
    }

    @Test
    public void test(){
        int[] a = {9};
        int[] ints = plusOne(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
