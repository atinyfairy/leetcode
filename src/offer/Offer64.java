package offer;

import java.util.stream.IntStream;

/**
 * @author 周意朗
 * Date: 2021/4/20
 * @since JDK 11
 */
public class Offer64 {
    public int sumNums(int n) {
        return IntStream.range(1, n + 1).sum();
    }
}
