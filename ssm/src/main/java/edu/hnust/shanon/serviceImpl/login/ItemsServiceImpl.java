package edu.hnust.shanon.serviceImpl.login;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.hnust.shanon.mapper.items.ItemsMapper;
import edu.hnust.shanon.po.Items;
import edu.hnust.shanon.po.ItemsToDisplay;
import edu.hnust.shanon.service.ItemsService;
import edu.hnust.shanon.utils.DivideWordsUtils;
@Service
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	//查询所有商品，根据种类和商品名称模糊匹配
	@SuppressWarnings("null")
	public List<ItemsToDisplay> queryAll(String keyWords) {
		String keyHandler = keyWords.substring(1,keyWords.length()-1);
		
		List<String> list = (List<String>) new DivideWordsUtils().divide(keyHandler);
		List<Items> result = new ArrayList<Items>();
		List<ItemsToDisplay> itemsToDisplayList = null;
		//查询到商品就返回商品列表，查不到返回空
		for(int i=0;i<list.size();i++) {
			result = itemsMapper.queryAll(list.get(i));
			if(result!=null && result.size()>0){
				itemsToDisplayList = new ArrayList<ItemsToDisplay>();
				for(int j=0;j<result.size();j++) {
					ItemsToDisplay itemsToDisplay = new ItemsToDisplay();
					itemsToDisplay.setImage(result.get(j).getImage());
					itemsToDisplay.setName(result.get(j).getName());
					itemsToDisplay.setPrice(result.get(j).getPrice());
					itemsToDisplay.setSales(result.get(j).getSales());
					itemsToDisplay.setSource(result.get(j).getSource());
					itemsToDisplay.setFree(result.get(j).getFree());
					itemsToDisplay.setSort(result.get(j).getSort());
					itemsToDisplayList.add(itemsToDisplay);
				}
				return itemsToDisplayList;
			}
		}
		return null;
	}
	
	//添加商品
	public void saveCommodity(Items items) {
		itemsMapper.saveCommodity(items);
	}
}
