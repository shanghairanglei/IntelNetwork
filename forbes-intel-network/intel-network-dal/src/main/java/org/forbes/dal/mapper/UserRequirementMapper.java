package org.forbes.dal.mapper;

import org.forbes.dal.entity.UserRequirement;

public interface UserRequirementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRequirement record);

    int insertSelective(UserRequirement record);

    UserRequirement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRequirement record);

    int updateByPrimaryKey(UserRequirement record);
}