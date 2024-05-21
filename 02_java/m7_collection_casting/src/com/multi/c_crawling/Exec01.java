package com.multi.c_crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Exec01 {
    public static void main(String[] args) {
        //크롤링 순서
        //1. 사이트 연결
        //2. 해당 페이지 다운로드(html)
        //3. 원하는 위치의 정보를 추출해냄

        Connection con = Jsoup.connect("http://www.naver.com");
        System.out.println("1. 사이트 연결 성공!!");

        Document doc = null;
        try{
            doc = con.get();
            System.out.println("2. 해당 페이지 다운로드 성공!!"); //index.html
            System.out.println("-----------------------");
            System.out.println(doc);

            for(int i = 0; i < 10; i++){

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try{
            Document doc1 = Jsoup.connect("http://www.naver.com").get();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
