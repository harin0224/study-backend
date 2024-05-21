package com.multi.c_crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Exec02 {
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
            Elements list = doc.select(".blind");
            //System.out.println("전일가: " + tag.text());

//            for(int i = 0; i < list.size(); i++){
//                Element tag = list.get(i);
//                System.out.println(tag.text());
//            }
        }catch(Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
