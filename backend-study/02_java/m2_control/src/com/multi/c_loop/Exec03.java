package com.multi.c_loop;

import java.util.Random;

public class Exec03 {
    public static void main(String[] args) {
        /* java.util.Random 클래스 */
        /* java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
         * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환 */

        /* 원하는 범위의 난수를 구하는 공식
         * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         * */

        /* 난수의 활용 */
        /* Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 반환한다.
         * 필요에 따라 정수 형태의 값을 원하는 범위 만큼 발생시켜야 하는 경우들이 존재하는데
         * 필요한 범위까지의 난수를 발생시켜보자.
         * */

        /* 원하는 범위의 난수를 구하는 공식
         * (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 */
        Random random = new Random();
        int rNum = random.nextInt(10);
        System.out.println("0부터 9까지 난수" + rNum);
        int rNum1 = random.nextInt(10)+1;
        System.out.println("0부터 9까지 난수" + rNum1);

        // 문제: 20부터 45까지의 난수
        int rNum3 = random.nextInt(26) + 20;
        System.out.println("20부터 45까지의 난수 " + rNum3);

        // -128부터 127까지 난수 (256)
        int rNum4 = random.nextInt(256) -128 ;
        System.out.println("20부터 45까지의 난수 " + rNum4);

        int target = 7;
        target = random.nextInt(100);


    }

}
