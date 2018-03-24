package top.unltra.service.impl;


import top.unltra.domain.Pick;
import top.unltra.mapper.PickMapper;
import top.unltra.service.PickService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Pick服务层接口实现类
 * @Service("pickService")用于将当前类注释为一个Spring的bean，名为bookService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("pickService")
public class PickServiceImpl implements PickService{
	/**
	 * 自动注入PickMapper
	 * */
	@Autowired
	private PickMapper pickMapper;

	/**
	 * PickService接口getAll方法实现
	 * @see { PickService }
	 * */
	@Transactional(readOnly=true)
	
	public List<Pick> getAll() {
		
		return pickMapper.findAll();
	}

}
