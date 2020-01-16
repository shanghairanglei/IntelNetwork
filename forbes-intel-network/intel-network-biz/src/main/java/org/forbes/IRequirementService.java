package org.forbes;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.forbes.comm.model.RequirementPageDto;
import org.forbes.comm.vo.RequirementVo;
import org.forbes.dal.entity.Requirement;

/**
 * @author Administrator
 */
public interface IRequirementService extends IService<Requirement> {


    /***
     * reqPage方法概述:分页查询所有需求,行业条件
     * @param pageDto
     * @return
     * @创建人 niehy(Frunk)
     * @创建时间 2020/1/16
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    IPage<RequirementVo> reqPage(IPage<RequirementVo> page, RequirementPageDto pageDto);

    /***
     * addReq方法概述:发布需求
     * @param requirementVo
     * @return
     * @创建人 niehy(Frunk)
     * @创建时间 2020/1/16
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    void addReq(RequirementVo requirementVo);


}
