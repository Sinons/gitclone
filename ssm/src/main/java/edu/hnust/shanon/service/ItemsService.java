package edu.hnust.shanon.service;

import java.util.List;

import edu.hnust.shanon.po.Items;
import edu.hnust.shanon.po.ItemsToDisplay;

public interface ItemsService {
	
	//��ѯ������Ʒ
	public List<ItemsToDisplay> queryAll(String keyHandler);
	
	//�����Ʒ
	public void saveCommodity(Items items);
}
