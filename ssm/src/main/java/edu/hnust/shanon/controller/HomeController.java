package edu.hnust.shanon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.hnust.shanon.po.Items;
import edu.hnust.shanon.po.ItemsToDisplay;
import edu.hnust.shanon.service.ItemsService;
import edu.hnust.shanon.utils.SpiderSourceUtils;
import us.codecraft.webmagic.Spider;

@RestController()
public class HomeController {
	
	@Autowired
	private ItemsService itemService;
	//private String reg = "https://search.jd.com/Search?keyword=ÊÖ»ú&&enc=utf-8";
	@RequestMapping(value="/search",method=RequestMethod.GET,produces="application/json")
	public List<ItemsToDisplay> queryCommodities(@RequestParam String keyWords) {
		List<ItemsToDisplay> itemsList = itemService.queryAll(keyWords);
		if(itemsList!=null && itemsList.size()!=0) {
			return itemsList;
		}
		return null;
		
	}
	
}
