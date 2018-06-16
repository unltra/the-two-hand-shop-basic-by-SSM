package top.unltra.ssm.dao;

import top.unltra.ssm.domain.admin;

public interface adminMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(admin record);

    int insertSelective(admin record);

    admin selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(admin record);

    int updateByPrimaryKey(admin record);
}