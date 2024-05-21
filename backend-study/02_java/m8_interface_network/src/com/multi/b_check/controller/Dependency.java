package com.multi.b_check.controller;

import com.multi.b_check.dto.Singer;
import com.multi.b_check.dto.Twice;

public class Dependency {
    public void doGet(){
        // 일반 객체 생성ㄹ
        Twice singer = new Twice();
        singer.sing();
        singer.compose();
        
        // 인터페이스를 사용해 결합도 낮춤
//        Singer singer1 = new BlackPink();
//        singer1.sing();
//        singer1.compose();

        //  전략 디자인 패턴 - 결합도 낮춤
        
    }
}
