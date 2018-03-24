package top.unltra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import top.unltra.domain.Admin;
import top.unltra.mapper.AdminMapper;
import top.unltra.service.AdminService;

/**
 * Admin服务层接口实现类
 * @Service("adminService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	/**
	 * 自动注入AdminMapper
	 * */
	@Autowired
	private AdminMapper adminMapper;

	/**
	 * AdminService接口login方法实现
	 * @see { AdminService }
	 * */
	@Transactional(readOnly=true)
	
	public Admin login(String aname, String apw) {
		return adminMapper.findWithAnameAndApw(aname, apw);
	}
}
