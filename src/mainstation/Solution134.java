package mainstation;

/**
 * @author 周意朗
 * Date: 2021/5/10
 * @since JDK 11
 * https://leetcode-cn.com/problems/gas-station/99999
 */
public class Solution134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int total = 0;
        int rest = 0;
        int[] res = new int[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            res[i] = gas[i] - cost[i];
            total += res[i];
        }
        if (total < 0) {
            return -1;
        }

        for (int i = 0; i < length; i++) {
            rest += res[i];
            if (rest < 0) {
                index = i + 1 ;
                rest =0;
            }
        }
        return index % length;
    }


    public static void main(String[] args) {
//        int[] gas = {2, 3, 4};
//        int[] cost = {3, 4, 3};
//        int[] gas = {1, 2, 3, 4, 5};
//        int[] cost = {3, 4, 5, 1, 2};
//        int[] gas = {7, 1, 0, 11, 4};
//        int[] cost = {5, 9, 1, 2, 5};
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};
//        int[] gas = {5};
//        int[] cost = {4};
        int i = canCompleteCircuit(gas, cost);
        System.out.println(i);
    }
}
