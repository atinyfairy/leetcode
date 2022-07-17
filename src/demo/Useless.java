package demo;

import java.util.HashMap;

/**
 * @author 周意朗
 * Date: 2021/4/28
 * @since JDK 11
 */
public class Useless {

    public static void demo31(double m) {
        int s = (int) (m / 1000);
        int sec = s % 60;
        s = s / 60;
        int min = s % 60;
        s = s / 60;
        int h = s % 60;
        StringBuilder sb = new StringBuilder("");
        if (h >= 10) {
            sb.append(String.valueOf(h));
        } else {
            sb.append("0");
            sb.append(h);
        }
        sb.append(":");
        if (min >= 10) {
            sb.append(String.valueOf(min));
        } else {
            sb.append("0");
            sb.append(min);
        }
        sb.append(":");
        if (sec >= 10) {
            sb.append(String.valueOf(sec));
        } else {
            sb.append("0");
            sb.append(sec);
        }
        System.out.println(sb.toString());
    }

    public static int demo33(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 5;
        }
        if (n == 3) {
            return 8;
        }
        if (n == 4) {
            return 12;
        }
        if (n == 5) {
            return 17;
        }
        if (n == 6) {
            return 13;
        }
        if (n == 7) {
            return 30;
        }
        if (n == 8) {
            return 38;
        }
        if (n == 9) {
            return 47;
        }
        if (n == 10) {
            return 18;
        }
        return 0;
    }

    public static int xz2() {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 2021;
        }
        int i = 1;
        for (; ; i++) {
            boolean flag = false;
            int res = i;
            while (true) {
                int temp = res % 10;
                if (nums[temp] == 0) {
                    flag = true;
                    break;
                }
                nums[temp] = nums[temp] - 1;
                res /= 10;
                if (res == 0) {
                    break;
                }
            }
            if (flag) {
                return i - 1;
            }
        }
    }

    public static int xz2HashMap() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 2021);
        map.put(1, 2021);
        map.put(2, 2021);
        map.put(3, 2021);
        map.put(4, 2021);
        map.put(5, 2021);
        map.put(6, 2021);
        map.put(7, 2021);
        map.put(8, 2021);
        map.put(9, 2021);
        int i = 1;
        for (; ; i++) {

            boolean flag = false;
            int num = i;
            while (true) {
                int temp = num % 10;
                if (map.get(temp) <= 0) {
                    flag = true;
                    break;
                }
                map.put(temp, map.get(temp) - 1);
                num = num / 10;
                if (num == 0) {

                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        return i - 1;
    }

    public static long xz4() {
//        long n = 4L;
        long n = 20210418L;
        long res = 0L;
        for (long i = 1L; i <= n; i++) {
            if (n % i != 0L) {
                continue;
            }
            long temp = n / i;
            for (long j = 1L; j <= temp; j++) {
                if (temp % j == 0L) {
                    res += 1L;
                }
            }
        }
        return res;
    }

    public static int removeElement(int[] nums, int val) {
        int t;
        int index = nums.length - 1;
        for (int i = 0; i < index; i++) {
            if (nums[i] == val) {
                while (nums[index] == val) {
                    index = index - 1;
                }
                t = nums[index];
                nums[index] = nums[i];
                nums[i] = t;
            }
        }
        return index ;
//        int n = nums.length;
//        int left = 0;
//        for (int right = 0; right < n; right++) {
//            if (nums[right] != val) {
//                nums[left] = nums[right];
//                left++;
//            }
//        }
//        return left;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a, 2));
    }

}
