package _4_Lop_Va_DoiTuong.bai_Tap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        for (int i =0 ; i < array.length; i++){
            array[i] = (int)(Math.random()*1000000+1);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(array);
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
