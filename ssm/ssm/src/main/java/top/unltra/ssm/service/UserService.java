package top.unltra.ssm.service;

import top.unltra.ssm.domain.user;

/**
    *Demo class
	*@author lnz86
	*@date 2018年3月25日 下午5:57:20
	*
	*/
public interface UserService {
	public user getUserByUid(int Uid);
	public void deleteUserByUid(int Uid);
}
