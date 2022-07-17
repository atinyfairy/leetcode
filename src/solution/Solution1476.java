package solution;

/**
 * @author 周意朗
 * Date: 2020/11/25
 * @since JDK 11
 */
class SubrectangleQueries {
    private int[][] belong;

    public SubrectangleQueries(int[][] rectangle) {
        belong = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {

    }

    public int getValue(int row, int col) {
        return belong[row][col];
    }
}

/**
 * Your Solution.SubrectangleQueries object will be instantiated and called as such:
 * Solution.SubrectangleQueries obj = new Solution.SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */

public class Solution1476 {

}
