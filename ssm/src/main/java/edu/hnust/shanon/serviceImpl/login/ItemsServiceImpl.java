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
	
	//��ѯ������Ʒ�������������Ʒ����ģ��ƥ��
	public List<Items> queryAll(String keyWords) {
		String keyHandler = keyWords.substring(1,keyWords.length()-1);
		
		List<String> list = (List<String>) new DivideWordsUtils().divide(keyHandler);
		List<Items> result = new ArrayList<Items>();
		//��ѯ����Ʒ�ͷ�����Ʒ�б��鲻�����ؿ�
		for(int i=0;i<list.size();i++) {
			result = itemsMapper.queryAll(list.get(i));
			if(result!=null && result.size()>0){
				return result;
			}
		}
		return null;
	}
	
	//�����Ʒ
	public void saveCommodity(Items items) {
		itemsMapper.saveCommodity(items);
	}

}
