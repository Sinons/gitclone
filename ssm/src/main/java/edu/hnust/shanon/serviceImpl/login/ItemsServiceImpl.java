package edu.hnust.shanon.serviceImpl.login;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.hnust.shanon.mapper.items.ItemsMapper;
import edu.hnust.shanon.po.Items;
import edu.hnust.shanon.service.ItemsService;
import edu.hnust.shanon.utils.DivideWordsUtils;

@Service
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	//查询所有商品，根据种类和商品名称模糊匹配
	public List<Items> queryAll(String keyWords) {
		String keyHandler = keyWords.substring(1,keyWords.length()-1);
		
		List<String> list = (List<String>) new DivideWordsUtils().divide(keyHandler);
		List<Items> result = new ArrayList<Items>();
		//查询到商品就返回商品列表，查不到返回空
		for(int i=0;i<list.size();i++) {
			result = itemsMapper.queryAll(list.get(i));
			if(result!=null && result.size()>0){
				return result;
			}
		}
		return null;
	}
	
	//添加商品
	public void saveCommodity(Items items) {
		itemsMapper.saveCommodity(items);
	}

}
