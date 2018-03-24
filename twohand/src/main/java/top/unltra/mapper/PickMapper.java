package top.unltra.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Select;
import top.unltra.domain.Pick;

/**
 * PickMapper接口
 * */
public interface PickMapper {

	/**
	 * 查询所有拾物信息
	 * @return 拾物对象集合
	 * */
	@Select(" select * from lp_pick ")
	List<Pick> findAll();
	
}
