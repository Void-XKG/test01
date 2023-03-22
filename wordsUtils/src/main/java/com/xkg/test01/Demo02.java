package com.xkg.test01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Demo02 {
    public static void main(String[] args) {
        String url = "https://www.baidu.com";
        Document document = Jsoup.parse(url, "1000");
        int i = 0;
    }
}
