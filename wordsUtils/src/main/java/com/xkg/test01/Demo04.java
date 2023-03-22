package com.xkg.test01;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        String w = "a";
        int num = 6;
        String url = "https://www.quword.com/ciyuan/page/"+w+"/"+num;
        CloseableHttpClient aDefault = HttpClients.createSystem();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse execute = aDefault.execute(httpGet);
        String result = EntityUtils.toString(execute.getEntity(), "utf-8");
        StatusLine statusLine = execute.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        if(statusCode != 200){
            System.out.println("没有数据了");
            return;
        }
        List<Origin> origins = new ArrayList<>();
        Document document = Jsoup.parse(result, "utf-8");
        Element article = document.getElementById("article");
        Elements wordAndMeanNodes = article.children();
        Elements allElements = article.getElementsByTag("h2");

        try {
            for (int i = 0; i < allElements.size(); i++) {
                Element element = allElements.get(i);
                Elements children1 = element.children();
                String word = children1.get(0).ownText();
                String means = element.ownText();
                List<String> originsMeans = new ArrayList<>();

                int index = wordAndMeanNodes.indexOf(element);
                for (int j = 0; j < wordAndMeanNodes.size(); j++) {
                    Element element2 = wordAndMeanNodes.get(index+1);
                    String name = element2.tag().getName();
                    if (!"p".equals(name)) {
                        break;
                    }
                    String s1 = element2.ownText();
                    originsMeans.add(s1);
                    index++;
                }
                Origin origin = new Origin(word, means, originsMeans);
                origins.add(origin);
            }
        }catch (Exception e){
            System.out.println("没数据了"+" w:"+w+" n:"+num);
        }
        for (Origin r : origins
        ) {
            System.out.println(r.word);
            System.out.println(r.mean);
            int i = 1;
            for (String s:r.originMeans
            ) {
                System.out.println(i + ": "+s);
                i++;
            }
        }
    }
}

