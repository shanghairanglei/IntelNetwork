package org.forbes.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.forbes.IRequirementService;
import org.forbes.comm.model.RequirementPageDto;
import org.forbes.comm.vo.RequirementVo;
import org.forbes.dal.entity.Requirement;
import org.forbes.dal.mapper.RequirementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 */
@Service
public class RequirementServiceImpl extends ServiceImpl<RequirementMapper, Requirement> implements IRequirementService {
    @Autowired
    RequirementMapper requirementMapper;


    /***
     * reqPage方法概述:分页查询所有需求,行业条件
     * @param pageDto
     * @return
     * @创建人 niehy(Frunk)
     * @创建时间 2020/1/16
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @Override
    public IPage<RequirementVo> reqPage(IPage<RequirementVo> page, RequirementPageDto pageDto) {
        return requirementMapper.reqPage(page, pageDto);
    }

    /***
     * addReq方法概述:发布需求,关联在
     * @param requirementVo
     * @return
     * @创建人 niehy(Frunk)
     * @创建时间 2020/1/16
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @Override
    public void addReq(RequirementVo requirementVo) {
        Requirement requirement = new Requirement();
        BeanCopier.create(RequirementVo.class, Requirement.class, false)
                .copy(requirementVo, requirement, null);
        baseMapper.insert(requirement);




    }


}
