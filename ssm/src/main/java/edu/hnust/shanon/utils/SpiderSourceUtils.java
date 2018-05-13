package edu.hnust.shanon.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class SpiderSourceUtils implements PageProcessor{
	
	 public static InputStream inStream = null;  
	    Site site = Site.me().setRetryTimes(3).setSleepTime(3000);  
	      
	    public Site getSite() {  
	        // TODO Auto-generated method stub  
	        return site;  
	    }  
	  
	    public void process(Page page) {  
	        // TODO Auto-generated method stub  
	        //将匹配到的链接都存储到links集合中  
	        List<String> links = page.getHtml().css("img/@src").all();  
	        //遍历links集合中的链接，然后下载  
	        for(int i = 0; i < links.size(); i++){  
	            String link = links.get(i);  
	            try {  
	                URL url = new URL(link);  
	                URLConnection con = url.openConnection();  
	                inStream = con.getInputStream();  
	                ByteArrayOutputStream outStream = new ByteArrayOutputStream();  
	                byte[] buf = new byte[1024];  
	                int len = 0;  
	                while((len = inStream.read(buf)) != -1){  
	                    outStream.write(buf,0,len);  
	                }  
	                inStream.close();  
	                outStream.close();  
	                File file = new File("C://MyWork//img//"+ "pic" +new Date().getTime()+".jpg");  
	                FileOutputStream op = new FileOutputStream(file);  
	                op.write(outStream.toByteArray());  
	                op.close();  
	            } catch (MalformedURLException e) {  
	                e.printStackTrace();  
	            } catch (IOException e) {  
	                e.printStackTrace();  
	            }  
	        }  
	    }  

    
}
