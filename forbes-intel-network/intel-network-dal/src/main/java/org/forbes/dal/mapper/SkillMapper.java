package org.forbes.dal.mapper;

import org.forbes.dal.entity.Skill;

public interface SkillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Skill record);

    int insertSelective(Skill record);

    Skill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Skill record);

    int updateByPrimaryKey(Skill record);
}