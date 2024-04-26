package com.multi.a_casting;

public class Casting {
    public static void main(String[] args) {
        // primitive(원시적인, 가공되지 않은) data
//  기본형 데이터, 원시 데이터
//<-> derived (파생된, 가공된) data
//  참조형 데이터, 파생 데이터
// 크기에 대한 것을 고려해야함.
//정수 byte(1)->short(2)->int(4)->long(8)

        byte a = 100; //-128~127
        int b = a; //기본형 복사
//int(큰) <- byte(작): 자동형변환

        int c = 120;
        byte d = (byte)c;
//byte(작) <- int(큰): 강제형변환

        //상속관계에서만 형변환(Casting,캐스팅) 가능
//Car(부모, 수퍼), Truck(자식, 서브)
//클래스간의 대소비교할 때는 개념적으로 접근
//부모클래스가 크고, 자식클래스가 작다

        //  업캐스팅(Upcasting): 하위 클래스 타입의 객체를 상위 클래스 타입으로 변환하는 것.
//  다운캐스팅(Downcasting): 상위 클래스 타입의 객체를 하위 클래스 타입으로 변환하는 것.


    }

}
