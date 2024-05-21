package com.multi.a_array;

public class Exec01 {
    public static void main(String[] args) {
        int[] Arr1 = {1,2,3,4};
        System.out.println(Arr1);
        // System.out.println(Arrays.toString(Arr1)); 이렇게하면 파이썬 print(arr)처럼 나오더라

        int [] Arr2 = new int[1000];
        System.out.println(Arr2);
        System.out.println(Arr2.toString());    // 주소값 찍어보기
        System.out.println(Arr2[0]);


    }
}