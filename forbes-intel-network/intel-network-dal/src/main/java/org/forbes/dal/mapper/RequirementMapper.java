package org.forbes.dal.mapper;

import org.forbes.dal.entity.Requirement;

public interface RequirementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Requirement record);

    int insertSelective(Requirement record);

    Requirement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Requirement record);

    int updateByPrimaryKey(Requirement record);
}