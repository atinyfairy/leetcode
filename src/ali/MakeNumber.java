package ali;

/**
 * @author 周意朗
 * Date: 2020/12/27
 * @since JDK 11
 * 要求给定的数组中任意i<k<j,有arr[i] + arr[j] != 2* arr[k]
 */
@SuppressWarnings("all")
public class MakeNumber {
    public static int[] makeNo(int size) {
        if (size == 1) {
            return new int[1];
        }
       /*
       对于一份达标,复制这一份,也达标
       [3,1,2]  -->  *2 -1 -->[5,1,3]
                -->  *2    -->[6,2,4]
        */
        int halfSize = (size + 1) / 2;
        int[] base = makeNo(halfSize);
        int[] ans = new int[size];
        int index = 0;
        //等长奇数达标
        for (; index < halfSize; index++) {
            ans[index] = base[index] * 2 + 1;
        }
        //等长偶数达标
        for (int i = 0; index < size; i++, index++) {
            ans[index] = base[i] * 2;
        }
        return ans;
    }

    //test
    public static boolean isValid(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int k = i + 1; k < N; k++) {
                for (int j = k + 1; j < N; j++) {
                    if (arr[i] + arr[j] == 2 * arr[k]) {
                        return false;
                    }
                }
            }
        }//for end
        return true;
    }

    public static void main(String[] args) {
        System.out.println("test begin");
        for (int N = 1; N < 50; N++) {
            int[] arr = makeNo(N);
            if (!isValid(arr)) {
                System.out.println("Oops");
            }
        }
        System.out.println("test end");
    }
}
