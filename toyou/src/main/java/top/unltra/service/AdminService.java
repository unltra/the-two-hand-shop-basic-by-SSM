package top.unltra.service;

import top.unltra.domain.Admin;

/**
 * Admin服务层接口
 * */
public interface AdminService {
	/**
	 * 判断Admin登录
	 * @param String aname
	 * @param String apw
	 * @return 找到返回Admin对象，没有找到返回null
	 * */
	Admin login(String aname,String apw);
}
