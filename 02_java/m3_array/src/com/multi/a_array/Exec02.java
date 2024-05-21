package com.multi.a_array;

public class Exec02 {
    public static void main(String[] args) {
        int[] jumsu = new int[1000];    //빈 배열

        //int변수 1000개가 모두 이름이 jumsu
        //jumsu를 인덱스(위치값)로 구분
        //첫 번째 jumsu의 index는 0! => jumsu[0]
        //두 번째 jumsu의 index는 1! => jumsu[1]
        //마지막 jumsu의 index는 전체개수-1! => jumsu[전체개수-1]

        for (int i = 0; i < jumsu.length; i++){
            System.out.println(jumsu[i]);

        }

        // foreach문, 인덱스 없어서 쓰려면 i 만들어서 ++ 해줘야함 그래서 값 출력하는 용도로 주로 사용
        for(int s : jumsu){
            System.out.println(s);
        }

        // i 만들기
        int i = 0;
        for(int s : jumsu){
            jumsu[i] = i;
            System.out.println(s);
            i++;
        }

        //foreach //향상된 for문     for (들어있는 데이터의 타입    변수  :   보고자는 객체의 주소 (변수) )
        //foreach: 배열의 첫위치값부터 하나씩 오른쪽가면서 자동으로
        //꺼내주는 반복문, length보다 작을 때까지!
    }
}
