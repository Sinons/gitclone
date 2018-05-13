package edu.hnust.shanon.service;

import java.util.List;

import edu.hnust.shanon.po.Items;

public interface ItemsService {
	
	//查询所有商品
	public List<Items> queryAll(String keyHandler);
	
	//添加商品
	public void saveCommodity(Items items);
}
