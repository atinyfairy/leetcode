package demo;

import java.util.Random;

/**
 * @author 周意朗
 * Date: 2021/4/18
 * @since JDK 11
 */
public class QuickSort {
    public static void quickSort(int l, int r, int[] nums) {
        //basic case
        if (l >= r) {
            return;
        }
        //定义左右边界
        int i = l;
        int j = r;
        int key = nums[l];


        while (i < j) {
            while (i < j && nums[j] >= key) {
                j--;
            }
            if (i < j) {
                nums[i] = nums[j];
                i++;
            }
            while (i < j && nums[i] < key) {
                i++;
            }
            if (i < j) {
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = key;
        quickSort(l, i - 1, nums);
        quickSort(i + 1, r, nums);
    }


    public static void main(String[] args) {
        int[] ex = new int[50];
        Random random = new Random(100);
        for (int i = 0; i < ex.length; i++) {
            ex[i] = random.nextInt(100);
        }

        long  startTime = System.currentTimeMillis();
        quickSort(0, ex.length - 1, ex);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");


        for (int j : ex) {
            System.out.print(j + " ");
        }
    }
}
