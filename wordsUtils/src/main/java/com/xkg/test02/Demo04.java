package com.xkg.test02;

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
        String w = "b";
        int num = 11;
        String url = "https://www.quword.com/root/page/" + w + "/" + num;
        CloseableHttpClient aDefault = HttpClients.createSystem();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse execute = aDefault.execute(httpGet);
        String result = EntityUtils.toString(execute.getEntity(), "utf-8");
        StatusLine statusLine = execute.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        if (statusCode != 200) {
            System.out.println("没数据了" + " w:" + w + " n:" + num);
            return;
        }
        List<Root> roots = new ArrayList<>();
        Document document = Jsoup.parse(result, "utf-8");
        Element article = document.getElementById("article");

        Elements wordAndMeanNodes = article.children();
        Elements allElements = article.getElementsByTag("h2");

        try {
            for (int i = 0; i < allElements.size(); i++) {
                Element element = allElements.get(i);
                Elements children1 = element.children();
                String rootValue = children1.get(0).ownText();
                String style = element.ownText();
                List<String> originsMeans = new ArrayList<>();

                int index = wordAndMeanNodes.indexOf(element);
                for (int j = 0; j < wordAndMeanNodes.size(); j++) {
                    Element element2 = wordAndMeanNodes.get(index + 1);

                    String name = element2.tag().getName();

                    if (!"p".equals(name)) {
                        break;
                    }
                    String text = element2.text();
                    originsMeans.add(text);
                    index++;
                }
                Root origin = new Root(style, rootValue, originsMeans);
                roots.add(origin);
            }
        } catch (Exception e) {
            System.out.println("没数据了" + " w:" + w + " n:" + num);
        }
        for (Root r : roots
        ) {
            System.out.println(r.style);
            System.out.println(r.rootValue);
            for (String s:r.originMeans
                 ) {
                System.out.println(s);
            }
        }
    }
}

