package top.unltra.ssm.dao;

import top.unltra.ssm.domain.kind;

public interface kindMapper {
    int deleteByPrimaryKey(Integer kid);

    int insert(kind record);

    int insertSelective(kind record);

    kind selectByPrimaryKey(Integer kid);

    int updateByPrimaryKeySelective(kind record);

    int updateByPrimaryKey(kind record);
}