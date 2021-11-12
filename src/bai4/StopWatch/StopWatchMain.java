package bai4.StopWatch;

import bai4.StopWatch.StopWatch;

import java.util.Scanner;

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        stopWatch.start();
        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 1000000000; j++) {

            }

        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
