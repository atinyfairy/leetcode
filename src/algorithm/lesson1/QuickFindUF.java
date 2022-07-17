package algorithm.lesson1;

/**
 * @author 周意朗
 * Date: 2021/3/31
 * @since JDK 11
 */
public class QuickFindUF {
    private int[] id;

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
