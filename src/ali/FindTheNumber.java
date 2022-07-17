package ali;

/**
 * @author 周意朗
 * Date: 2020/12/27
 * @since JDK 11
 * 给定一个数组[1,2,3]
 * 他们可以组成键值对[1,1],[1,2],[1,3].....
 * 自己也可以和自己组合
 * 要求给定数组并找到数组中指定的值
 *
 * BFPRT算法是最优解, 但是我没用
 *
 */
@SuppressWarnings("all")
public class FindTheNumber {
    //对原数组进行排序
    public static int[] mergeSort(int[] nums, int l, int h) {
        if (l == h) {
            return new int[]{nums[l]};
        }

        int mid = l + (h - l) / 2;
        //左有序数组
        int[] leftArr = mergeSort(nums, l, mid);
        //右有序数组
        int[] rightArr = mergeSort(nums, mid + 1, h);
        //新有序数组
        int[] newNum = new int[leftArr.length + rightArr.length];

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length) {
            newNum[m++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            newNum[m++] = rightArr[j++];
        }
        return newNum;
    }

    public static String getNumber(int[] arr, int index) {
        if (arr.length <= 0 || null == arr || index < 0) {
            return "error input, check your array or index";
        }
        int[] sortedArr = mergeSort(arr, 0, arr.length - 1);
        //数组从0开始, 但是index不是从0开始,所以index-1
        index = index - 1;
        int keyIndex = index / arr.length;
        int valueIndex = index - keyIndex * arr.length;
        return "(" + sortedArr[keyIndex] + "," + sortedArr[valueIndex] + ")";
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
        String number = getNumber(arr, 11);
        System.out.println(number);
    }

}
