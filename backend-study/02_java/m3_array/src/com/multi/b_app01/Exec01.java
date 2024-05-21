package com.multi.b_app01;

import java.util.Arrays;

public class Exec01 {
    public static void main(String[] args) {
        int[] count = new int[1000];
        // 최대 투표 수를 찾습니다.
        int max1 = Arrays.stream(count).max().orElse(-1);

    }
}
