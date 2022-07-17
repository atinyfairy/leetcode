package utils;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/4/20
 * @since JDK 11
 * <p>
 * <p>
 * 1000ms  ->	1s    ->1000
 * 60s  	->  1min  ->60000ms
 * 60min	->	1h	  ->3600000ms
 * 1d		->	24h	  ->8,640,0000ms
 */
public class Useless {
    public static void find(int ms) {
        int days = ms / 86400000;
        ms = ms % 86400000;
        int hours = ms / 3600000;
        ms = ms % 3600000;
        int mins = ms / 60000;
        ms = ms % 60000;
        int secs = ms / 1000;
        System.out.println("days->"+days);
        System.out.println("hours->"+hours);
        System.out.println("mins->"+mins);
        System.out.println("seconds->"+secs);
    }

    @Test
    public void test() {
        int ms = 9;
//        int ms = 183543210;
        find(ms);
    }
}
