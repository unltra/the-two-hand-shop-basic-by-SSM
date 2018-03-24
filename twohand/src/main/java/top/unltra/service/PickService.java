package top.unltra.service;

import java.util.List;

import top.unltra.domain.Pick;
/**
 * Pick服务层接口
 * */

public interface PickService {
	/**
	 * 查找所有拾物
	 * @return Pick对象集合
	 * */
	List<Pick> getAll();
}
