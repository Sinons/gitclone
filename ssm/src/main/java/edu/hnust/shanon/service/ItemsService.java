package edu.hnust.shanon.service;

import java.util.List;

import edu.hnust.shanon.po.Items;

public interface ItemsService {
	
	//��ѯ������Ʒ
	public List<Items> queryAll(String keyHandler);
	
	//�����Ʒ
	public void saveCommodity(Items items);
}
