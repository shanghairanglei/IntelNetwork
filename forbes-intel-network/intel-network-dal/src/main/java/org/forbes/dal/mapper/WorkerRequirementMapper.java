package org.forbes.dal.mapper;

import org.forbes.dal.entity.WorkerRequirement;

public interface WorkerRequirementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WorkerRequirement record);

    int insertSelective(WorkerRequirement record);

    WorkerRequirement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WorkerRequirement record);

    int updateByPrimaryKey(WorkerRequirement record);
}