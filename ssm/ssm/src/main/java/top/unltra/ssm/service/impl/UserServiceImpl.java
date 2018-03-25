package top.unltra.ssm.service.impl;

import javax.annotation.Resource;  

import org.springframework.stereotype.Service; 

import top.unltra.ssm.dao.userMapper;
import top.unltra.ssm.domain.user;
import top.unltra.ssm.service.UserService;

/**
    *Demo class
	*@author lnz86
	*@date 2018年3月25日 下午5:58:10
	*
	*/
@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private userMapper userMapper;  
    @Override  
    public user getUserByUid(int Uid) {  
        // TODO Auto-generated method stub  
        return this.userMapper.selectByPrimaryKey(Uid);  
    }
	@Override
	public void deleteUserByUid(int Uid) {
		// TODO Auto-generated method stub
		this.userMapper.deleteByPrimaryKey(Uid);
	}  
  
}  
