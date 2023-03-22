package com.xkg.test01;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        String url = "https://www.quword.com/ciyuan/page/z/1000";
        HttpClient aDefault = HttpClients.createSystem() ;
        HttpGet httpGet = new HttpGet(url);

        HttpResponse execute = aDefault.execute(httpGet);
        HttpEntity entity = execute.getEntity();
        StatusLine statusLine = execute.getStatusLine();
        String result = EntityUtils.toString(execute.getEntity(), "utf-8");
        System.out.println(result);


    }
}
