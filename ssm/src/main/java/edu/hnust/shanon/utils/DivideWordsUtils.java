package edu.hnust.shanon.utils;

import java.util.ArrayList;
import java.util.List;

//分词工具类
public class DivideWordsUtils {
	
	public List<String> divide(String keywords){
		
		List<String> list = new ArrayList<String>();		
		for(int i=3; i>0;i--)
			for(int j=0;j<keywords.length()-i+1;j++) 
				if(j!=j+i)
					list.add(keywords.substring(j,j+i));
		return list;
	}
	
}
