package com.multi.c_file;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileText2 {
    String s1 = JOptionPane.showInputDialog("날짜입력");
    String s2 = JOptionPane.showInputDialog("제목입력");
    String s3 = JOptionPane.showInputDialog("내용입력");
    FileWriter file = null;
    // 컴파일 에러, 개발자가 exception 해줘야 함
//    try{
//        file = new FileWriter(s1 + ".txt");

//
//        file.write(s1 + "/n");
//    }finally{
//        if (file!= null){
//            try {
//                file.close();
//            }catch (IOException e){
//                throw new RuntimeException(e);
//            }
//
//        }
//    }
}
