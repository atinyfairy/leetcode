package demo;

/**
 * @author 周意朗
 * Date: 2021/6/17
 * @since JDK 11
 */
public class Fib {
    int fib(int n) {
        if (n > 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }



    int fibLessSpace(int n) {
        if (n > 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int pre = 1 , curr = 1, sum;
        for (int i = 3; i < n; i++) {
            sum = pre + curr;
            pre = curr;
            curr = sum;
        }
        return curr;
    }
}
