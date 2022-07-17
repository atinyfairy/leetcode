package algorithm.lesson1;

/**
 * @author 周意朗
 * Date: 2021/4/2
 * @since JDK 11
 */
public class Weighted_QuickUnion {
    private int[] id;
    private int[] sz;

    public Weighted_QuickUnion(int N) {
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 0;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j]=i;
            sz[i] += sz[j];
        }
    }
}
