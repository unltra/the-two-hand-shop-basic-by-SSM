package top.unltra.ssm.dao;

import top.unltra.ssm.domain.pick;

public interface pickMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(pick record);

    int insertSelective(pick record);

    pick selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(pick record);

    int updateByPrimaryKey(pick record);
}