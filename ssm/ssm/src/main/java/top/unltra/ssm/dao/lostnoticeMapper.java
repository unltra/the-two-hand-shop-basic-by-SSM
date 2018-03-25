package top.unltra.ssm.dao;

import top.unltra.ssm.domain.lostnotice;

public interface lostnoticeMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(lostnotice record);

    int insertSelective(lostnotice record);

    lostnotice selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(lostnotice record);

    int updateByPrimaryKey(lostnotice record);
}