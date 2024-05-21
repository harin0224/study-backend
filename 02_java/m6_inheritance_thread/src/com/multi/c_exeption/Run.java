package com.multi.c_exeption;

public class Run {
    public static void main(String[] args) {
        // 에러종류
        // - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 --> 소스코드로 해결안됨 --> 심각한 에러
        // - 컴파일 에러 : 소스코드 문법상 오류 --> 빨간줄로 애초에 오류 알려줌 (매번 컴파일이 진행되고 있기 때문에 컴파일시 문제가 있는 것들을 미리 알려준다)
        // - 런타임 에러 : 코드 상으로는 문제가 없는데 프로그램 실행할 때 발생하는 에러 (사용자의 실수 일 수도 있고 개발자가 예측 가능 한 경우를 제대로 처리 안 해 놓은걸 수도 있다)

        // - 논리 에러 : 문법상으로도 문제 없고 실행했을 때도 굳이 문제는 없지만 프로그램 의도상 맞지 않는 것

        // 우리는 시스템 에러를 제외한 컴파일에러, 런타임에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업
        // 이런 것들을 "예외"라고 한다. -->Exception

        // 이러한 예외들이 "발생"했을 경우에 대해서 "처리"하는 방법을 "예외처리"라고 한다.


        //CheckedException 은 반드시 예외처리를 해줘야한다.
        // 조건문, 소스 코드의 수정으로 해결이 안된다. -- 예측불가
        // 주로 외부 매개체의 입출력시 발생

        //IOException  입출력 과정중 문제가 생겼을때 던지는 예외

        /*1. try~ catch()처리 : 이구문에서 바로 예외를 처리하겠다.
         *
         * try :  예외가 발생할 가능성이있는 코드를 블록내에 작성
         * catch (발생될예외클래스 매개변수): try 구문에서 예외가 발생하면 어떻게 처리를 할것인지 작성
         * finally : try~catch 문 수행후 반드시 꼭 실행되어야 하는 코드를 작성
         *
         * */

        //2. throws : 지금 이 메소드에서 예외를 처리하지 않고 현재 이메소드를 호출한 곳으로 위임하겠다

        // try ~ with ~ resource :  반납할 close자원 이 있는경우 처리 -> try () 괄호 안에 객체 생성할수 있고
        //이 괄호안에서 생성한 객체는 close 해주지않아도 자동 close 된다.
        UnCheck un = new UnCheck();
        un.method1();
    }
}