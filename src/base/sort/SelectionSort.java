package base.sort;

import java.util.Arrays;

/**
 * @author 周意朗
 * Date: 2021/8/15
 * @since JDK 11
 * 选择排序
 */
public class SelectionSort {
    public static void selectionSort(int[] a) {

        System.out.println("before sort:");
        System.out.println(Arrays.toString(a));

        int length = a.length;
        int min;
        int ex;
        for (int i = 0; i < length; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            ex = a[i];
            a[i] = a[min];
            a[min] = ex;
        }

        System.out.println("after sort:");
        System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {
        int[] a = {6,46,41,61,6,16,156,358,4867,64,67};
        selectionSort(a);
    }

}
