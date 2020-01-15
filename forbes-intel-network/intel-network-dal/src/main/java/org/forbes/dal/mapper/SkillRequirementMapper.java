package org.forbes.dal.mapper;

import org.forbes.dal.entity.SkillRequirement;

public interface SkillRequirementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkillRequirement record);

    int insertSelective(SkillRequirement record);

    SkillRequirement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SkillRequirement record);

    int updateByPrimaryKey(SkillRequirement record);
}