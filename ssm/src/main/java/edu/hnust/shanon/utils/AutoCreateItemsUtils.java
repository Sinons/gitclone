package edu.hnust.shanon.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import edu.hnust.shanon.po.Items;
import edu.hnust.shanon.po.UserDetails;

//�Զ��������ݹ�����
public class AutoCreateItemsUtils {
	static final String COMMODITIES = "commodity"; 
	static final String USERS = "users";
	static final String ORDERS = "orders";
	static final String SHOPS = "shops";
	static final String COMMENT = "comments";
	static final int COMPREHENSIVE = 100;
	static final int PRICE = 5000;
	static final int SALES = 10000;
	static final int SHOPID = 1000;
	public static List<Items> createCommodities(String type,int number){
		List<Items> list = new ArrayList<Items>();
		
		if(type==COMMODITIES) {
			List<String> name = new ArrayList<String>();
			name.add("��Ϊ");
			name.add("С��");
			name.add("����");
			name.add("oppo");
			name.add("vivo");
			name.add("ƻ��");
			name.add("����");
			List<String> brand = new ArrayList<String>();
			brand.add("��Ϊ");
			brand.add("С��");
			brand.add("����");
			brand.add("oppo");
			brand.add("vivo");
			brand.add("ƻ��");
			brand.add("����");
			brand.add("�ֻ�");
			List<String> sort = new ArrayList<String>();
			sort.add("Ь��");
			sort.add("��ʳ");
			sort.add("��װ");
			sort.add("����");
			sort.add("����");
			List<String> source = new ArrayList<String>();
			source.add("����");
			source.add("�Ϻ�");
			source.add("Ȫ��");
			source.add("����");
			source.add("����");
			List<String> free = new ArrayList<String>();
			free.add("yes");
			free.add("no");
			Random random = new Random();
			while(number--!=0) {
				Items items = new Items();
				Integer comprehensive = random.nextInt(COMPREHENSIVE);
				Integer price = 10 + random.nextInt(PRICE);
				Integer sales = random.nextInt(SALES);
				String brandIndex = brand.get(random.nextInt(brand.size()));
				items.setComprehensive(comprehensive.toString());
				items.setBrand(brandIndex);
				items.setFree(free.get(random.nextInt(free.size())));
				items.setImage("picture" + new Date().getTime());
				items.setName(name.get(random.nextInt(name.size())));
				items.setPrice(price.toString());
				items.setSales(sales.toString());
				items.setShop_id(random.nextInt(SHOPID));
				items.setSort(sort.get(random.nextInt(sort.size())));
				items.setSource(source.get(random.nextInt(source.size())));
				list.add(items);
			}	
		}
		return list;
	}
	public static List<UserDetails> createUsers(int number){
		 
	    int id;
		String phone;
		String password;
		int address_id;
		String name;
		String nick;
		Date create_date;
		return null;
	}
}
