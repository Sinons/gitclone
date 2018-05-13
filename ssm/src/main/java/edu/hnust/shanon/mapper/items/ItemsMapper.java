package edu.hnust.shanon.mapper.items;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import edu.hnust.shanon.po.Items;

public interface ItemsMapper {
	
	public List<Items> queryAll(@Param("keyHandler")String keyHandler);
	
	@Insert("<script>insert into commodity(id,name,sort,price,shop_id,source,image,brand,sales,comprehensive,free) values(null,#{name},#{sort},#{price},#{shop_id},#{source},#{image},#{brand},#{sales},#{comprehensive},#{free})</script>")
	public void saveCommodity(Items items);
	
}
