package solution;

/**
 * @author 周意朗
 * Date: 2021/7/13
 * @since JDK 11
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        int reverse = -1;
        int height = 0;
        char[] chars = s.toCharArray();
        int width = -1;
        int length = s.length();

        int[][] maxti = new int[numRows - 1][length / 2 - 1];

        for (int i = 0; i < length; i++) {
            if (height == 0 || height == (numRows - 1)) {
                reverse = -reverse;
                width += 1;
            }
            maxti[height][width] = chars[i];
            height += reverse;
        }

        return null;
    }

    public static void main(String[] args) {
        int[][] ints = new int[5][6];
        System.out.println(ints.length);
        System.out.println(ints[0].length);
    }
}
