package solution.unsolved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author 周意朗
 * Date: 2021/1/6
 * @since JDK 11
 * 给你一个变量对数组 equations 和一个实数值数组 values 作为已知条件，其中 equations[i] = [Ai, Bi] 和 values[i] 共同表示等式 Ai / Bi = values[i] 。
 * 每个 Ai 或 Bi 是一个表示单个变量的字符串。
 * 另有一些以数组 queries 表示的问题，其中 queries[j] = [Cj, Dj] 表示第 j 个问题，请你根据已知条件找出 Cj / Dj = ? 的结果作为答案。
 * 返回 所有问题的答案 。如果存在某个无法确定的答案，则用 -1.0 替代这个答案。
 * 注意：输入总是有效的。你可以假设除法运算中不会出现除数为 0 的情况，且不存在任何矛盾的结果。
 * 示例 1：
 * 输入：equations = [["a","b"],["b","c"]]
 * values = [2.0,3.0],
 * queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
 * 输出：[6.00000,0.50000,-1.00000,1.00000,-1.00000]
 * 解释：
 * 条件：a / b = 2.0, b / c = 3.0
 * 问题：a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
 * 结果：[6.0, 0.5, -1.0, 1.0, -1.0 ]
 * 示例 2：
 * 输入：equations = [["a","b"],["b","c"],["bc","cd"]],
 * values = [1.5,2.5,5.0],
 * queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
 * 输出：[3.75000,0.40000,5.00000,0.20000]
 * 示例 3：
 * 输入：equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
 * 输出：[0.50000,2.00000,-1.00000,-1.00000]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/evaluate-division
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int divide, be_divided, result;
        HashMap<String, Double> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        List<String> equation;
        for (int i = 0; i < equations.size(); i++) {
            equation = equations.get(i);
            if (equation.get(0).length() == 1 && equation.get(1).length() == 1) {
                if (!map.containsKey(equation.get(0)) && !map.containsKey(equation.get(1))) {
                    map.put(equation.get(0), values[0]);
                    map.put(equation.get(1), (double) 1);
                } else {
                    if (map.containsKey(equation.get(0))) {
                        map.put(equation.get(1), (Double) (map.get(equation.get(0)) / values[i]));
                    } else {
                        map.put(equation.get(0), (Double) (map.get(equation.get(1)) * values[i]));
                    }
                }
            } else {
                char[] chars0 = equation.get(0).toCharArray();
                char[] chars1 = equation.get(1).toCharArray();
                for (int j = 0; j < chars0.length; j++) {
                    set.add(chars0[j]);
                }
            }

        }

        return null;
    }


    public static void main(String[] args) {


    }
}
