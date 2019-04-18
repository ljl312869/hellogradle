package wtyt.xmlHttpDemo;

import org.apache.commons.httpclient.methods.PostMethod;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.SignatureMethod;

/**
 * @Description: 测试调用一些meeting第三方接口
 * @Author: lijunlei
 * @CreateDate: 2019/4/17 15:42
 */
public class TestMeetingInterface {
       /**
       * @param args
       */
        public static void main(String[] args) {
            String url = "https://fcsupergw.dl.alipaydev.com/open/api/common/requestasync.htm";
            TestMeetingInterface tmi = new TestMeetingInterface();
            System.out.println(tmi.post(url,"listSummaryMeeting.xml"));

            /*//判断当前系统是否支持Java AWT Desktop扩展
           if(java.awt.Desktop.isDesktopSupported()){
               try {
                   URI path = tmi.getClass().getResource("/listSummaryMeeting.xml").toURI();
                   System.out.println(path);
                   //创建一个URI实例
     //             java.net.URI uri = java.net.URI.create(path);
                   //获取当前系统桌面扩展
                   java.awt.Desktop dp = java.awt.Desktop.getDesktop();
                   //判断系统桌面是否支持要执行的功能
                   if(dp.isSupported(java.awt.Desktop.Action.BROWSE)){
                       //获取系统默认浏览器打开链接
                       dp.browse(path);
                   }
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }*/
        }



     /**
     * 发送xml数据请求到server端
     * @param url xml请求数据地址
     * @param xmlString 发送的xml数据流
     * @return null发送失败，否则返回响应内容
     */
   public String post(String url,String xmlFileName){
      //关闭
      System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
      System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
      System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "stdout");

      //创建httpclient工具对象
      HttpClient client = new HttpClient();
      //创建post请求方法
      PostMethod myPost = new PostMethod(url);
      //设置请求超时时间
      client.setConnectionTimeout(300*1000);
      String responseString = null;
      try{
          //设置请求头部类型
          myPost.setRequestHeader("Content-Type","text/xml");
          myPost.setRequestHeader("charset","utf-8");

          //设置请求体，即xml文本内容，注：这里写了两种方式，一种是直接获取xml内容字符串，一种是读取xml文件以流的形式
          myPost.setRequestBody(getXmlInfo());

//          InputStream body=this.getClass().getResourceAsStream("/"+xmlFileName);
//          myPost.setRequestBody(body);
            myPost.setRequestEntity(new StringRequestEntity(getXmlInfo(),"text/xml","utf-8"));
          int statusCode = client.executeMethod(myPost);
               if(statusCode == HttpStatus.SC_OK){
                   BufferedInputStream bis = new BufferedInputStream(myPost.getResponseBodyAsStream());
                   byte[] bytes = new byte[1024];
                   ByteArrayOutputStream bos = new ByteArrayOutputStream();
                   int count = 0;
                   while((count = bis.read(bytes))!= -1){
                           bos.write(bytes, 0, count);
                       }
                   byte[] strByte = bos.toByteArray();
                   responseString = new String(strByte,0,strByte.length,"utf-8");
                   bos.close();
                   bis.close();
               }
          }catch (Exception e) {
              e.printStackTrace();
          }
       myPost.releaseConnection();
       return responseString;
   }

    /**
     * 用传统的URI类进行请求
     * @param urlStr
     */
    public void testPost(String urlStr) {
        try {
            URL url = new URL(urlStr);
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
            con.setRequestProperty("Pragma:", "no-cache");
            con.setRequestProperty("Cache-Control", "no-cache");
            con.setRequestProperty("Content-Type", "text/xml");

            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
            String xmlInfo = getXmlInfo();
            System.out.println("urlStr=" + urlStr);
            System.out.println("xmlInfo=" + xmlInfo);
            out.write(new String(xmlInfo.getBytes("UTF-8")));
            out.flush();
            out.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(con
                     .getInputStream()));
        String line = "";
        for (line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getXmlInfo() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String format = sdf.format(new Date());
        System.out.println(format);
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<document>");
        sb.append("    <request>");
        sb.append("        <head>");
        sb.append("            <Version>1.0.0</Version>");
        sb.append("            <Appid>2018052200000204</Appid>");
        sb.append("            <Function>ant.mybank.merchantprod.merch.register.query</Function>");
        sb.append("            <ReqTime>"+format+"</ReqTime>");
        sb.append("            <ReqTimeZone>UTC+8</ReqTimeZone>");
        sb.append("            <ReqMsgId>o18071809485641380148</ReqMsgId>");
        sb.append("            <InputCharset>UTF-8</InputCharset>");
        sb.append("            <SignType>RSA</SignType>");
        sb.append("            <Reserve></Reserve>");
        sb.append("        </head>");
        sb.append("        <body>");
        sb.append("            <IsvOrgId>202210000000000001025</isvOrgId>");
        sb.append("            <OrderNo>2017041811150700010000000000000000000105</merchantId>");
        sb.append("        </body>");
        sb.append("    </request>");
        sb.append("   <ds:Signature xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">");
        sb.append("        <ds:SignedInfo>");
        sb.append("           <ds:CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/>");
        sb.append("           <ds:SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\"/>");
        sb.append("            <ds:Reference URI=\"\">");
        sb.append("                <ds:Transforms>");
        sb.append("                   <ds:Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/>");
        sb.append("                </ds:Transforms>");
        sb.append("               <ds:DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/>");
        sb.append("                <ds:DigestValue>HNK7Q4ZxF5zVGri4G4RudoKJD7o=</ds:DigestValue>");
        sb.append("            </ds:Reference>");
        sb.append("        </ds:SignedInfo>");
        sb.append("        <ds:SignatureValue>lO+phgX5OHBe3Rl4yEmeaTuvQoxEqm29LPkLrrLMbF8miGG7FlXMSeueX5oH8q62nkc1x6uDbi/J 7gqrcbz/HrYj9KvcNRnyAvg5c2L7EEpJJ7gOXWKwJpph5OIY49nrpKPLRy5P6TBdXZoARImmeU4X HU9rRsnLlu0WjXaIUAsFq29iELb1voPc0un1BR+CO1Pua6NiENgB46Bo+pE/QaSHmSDzktwzsMgz xC0pltMhZlUMS7M65mo/SRx0fVrgPL3G+F/MKYENunfIYmWbN7/hl5RI8NS5cQGvsK1fKtmnX+B8 GrxA9JOlITaakzsB/ZdzQTzeeVWse6LyJb4xQQ==</ds:SignatureValue>");
        sb.append("    </ds:Signature>");
        sb.append("/document>");

        return sb.toString();
    }
}
