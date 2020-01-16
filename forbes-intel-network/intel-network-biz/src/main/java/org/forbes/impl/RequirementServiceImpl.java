package org.forbes.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.forbes.IRequirementService;
import org.forbes.dal.entity.Requirement;
import org.forbes.dal.mapper.RequirementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 */
@Service
public class RequirementServiceImpl extends ServiceImpl<RequirementMapper,Requirement> implements IRequirementService {

    @Autowired
    IUserRequirementService userRequirementService;


    /***
     * save方法概述:级联添加用户和需求表内容
     * @param requirement
     * @return
     * @创建人 niehy(Frunk)
     * @创建时间 2020/1/16
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean save(Requirement requirement) {

        UserRequirement userRequirement = new UserRequirement();
        //获取任务需求id
        userRequirement.setRequireId(requirement.getId());

        //userRequirement.setUserId();
        userRequirementService.save(userRequirement);

        return super.save(requirement);
    }
}
