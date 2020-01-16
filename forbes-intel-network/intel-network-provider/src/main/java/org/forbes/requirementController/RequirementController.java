package org.forbes.requirementController;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.forbes.IRequirementService;
import org.forbes.comm.constant.ReqCommonConstant;
import org.forbes.comm.constant.SaveValid;
import org.forbes.comm.enums.BizResultEnum;
import org.forbes.comm.enums.CheckStateEnum;
import org.forbes.comm.model.BasePageDto;
import org.forbes.comm.model.RequirementPageDto;
import org.forbes.comm.utils.ConvertUtils;
import org.forbes.comm.vo.Result;
import org.forbes.dal.entity.Requirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 需求控制层
 *
 * @author Administrator
 */
@RequestMapping("/requirement")
@Api(tags = {"任务需求管理"})
@Slf4j
@RestController
public class RequirementController {

    @Autowired
    IRequirementService requirementService;


    /***
     * selectPage方法慨述:分页查询任务需求列表
     * @param pageDto
     * @return Result<IPage<SysPermission>>
     * @创建人 frunk
     * @创建时间 2019年12月10日 下午1:48:45
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ApiOperation(value = "分页查询任务需求列表")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = Result.REQUIREMENT_ERROR_MSG),
            @ApiResponse(code = 200, message = Result.REQUIREMENT_MSG)
    })
    public Result<IPage<Requirement>> selectPage(BasePageDto pageDto, RequirementPageDto requirementPageDto) {
        log.debug("传入参数为：" + JSON.toJSONString(requirementPageDto));
        Result<IPage<Requirement>> result = new Result<>();
        QueryWrapper<Requirement> qw = new QueryWrapper<Requirement>();
        if (ConvertUtils.isNotEmpty(requirementPageDto)) {
            //行业类型
            if (ConvertUtils.isNotEmpty(requirementPageDto.getVocationType())) {
                qw.eq(ReqCommonConstant.VOCATION_TYPE, requirementPageDto.getVocationType());
            }
            //任务类型
            if (ConvertUtils.isNotEmpty(requirementPageDto.getTaskType())) {
                qw.eq(ReqCommonConstant.TASK_TYPE, requirementPageDto.getTaskType());
            }
            //金额最低
            if (ConvertUtils.isNotEmpty(requirementPageDto.getMinSalary())) {
                qw.ge(ReqCommonConstant.MIN_SALARY, requirementPageDto.getMinSalary());
            }
            //金额最高
            if (ConvertUtils.isNotEmpty(requirementPageDto.getMaxSalary())) {
                qw.le(ReqCommonConstant.MAX_SALARY, requirementPageDto.getMaxSalary());
            }
        }
        IPage<Requirement> page = new Page<Requirement>(pageDto.getPageNo(), pageDto.getPageSize());
        IPage<Requirement> requirements = requirementService.page(page, qw);
        result.setResult(requirements);
        log.debug("返回值为:" + JSON.toJSONString(result.getResult()));
        return result;
    }


    /***
     * selectPage方法慨述:添加任务需求
     * @param requirement
     * @return Result<SysPermission>
     * @创建人 frunk
     * @创建时间 2019年12月10日 下午1:48:45
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "发布任务需求")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = Result.ADD_REQUIREMENT_ERROR_MSG),
            @ApiResponse(code = 200, message = Result.ADD_REQUIREMENT_MSG)
    })
    public Result<Requirement> add(@RequestBody @Validated(value = SaveValid.class) Requirement requirement) {
        log.debug("传入参数为：" + JSON.toJSONString(requirement));
        Result<Requirement> result = new Result<Requirement>();
        if (ConvertUtils.isEmpty(requirement)) {
            //任务对象为空
            result.setBizCode(BizResultEnum.ENTITY_EMPTY.getBizCode());
            result.setMessage(BizResultEnum.ENTITY_EMPTY.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(requirement.getName())) {
            //任务名称为空
            result.setBizCode(BizResultEnum.R_NAME.getBizCode());
            result.setMessage(BizResultEnum.R_NAME.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(requirement.getTaskType())) {
            //任务类型为空
            result.setBizCode(BizResultEnum.TASKTYPE.getBizCode());
            result.setMessage(BizResultEnum.TASKTYPE.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(requirement.getVocationType())) {
            //行业类型为空
            result.setBizCode(BizResultEnum.VOCATIONTYPE.getBizCode());
            result.setMessage(BizResultEnum.VOCATIONTYPE.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(requirement.getCycleTime())) {
            //任务周期为空
            result.setBizCode(BizResultEnum.CYCLETIME.getBizCode());
            result.setMessage(BizResultEnum.CYCLETIME.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(requirement.getMinSalary()) || ConvertUtils.isEmpty(requirement.getMaxSalary())) {
            //薪资为空
            result.setBizCode(BizResultEnum.SALARY.getBizCode());
            result.setMessage(BizResultEnum.SALARY.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(requirement.getPartyB())) {
            //服务方为空
            result.setBizCode(BizResultEnum.SALARY.getBizCode());
            result.setMessage(BizResultEnum.SALARY.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(requirement.getDescription())) {
            //描述为空
            result.setBizCode(BizResultEnum.DESCRIPTION.getBizCode());
            result.setMessage(BizResultEnum.DESCRIPTION.getBizMessage());
            return result;
        }
        //给定默认审核状态待审核
        requirement.setCheckState(CheckStateEnum.EXAMINE_ING.getCode());
        requirementService.save(requirement);
        result.setResult(requirement);
        log.debug("返回值为:" + JSON.toJSONString(result.getResult()));
        return result;
    }


    /***
     * selectPage方法慨述:查看任务详情
     * @param id
     * @return Result<SysPermission>
     * @创建人 frunk
     * @创建时间 2019年12月10日 下午1:48:45
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "查看任务详情")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = Result.REQUIREMENT_ERROR_MSG),
            @ApiResponse(code = 200, message = Result.REQUIREMENT_MSG)
    })
    public Result<Requirement> detail(@PathVariable String id) {
        log.debug("传入参数为：" + JSON.toJSONString(id));
        Result<Requirement> result = new Result<Requirement>();
        if (ConvertUtils.isEmpty(id)) {
            //任务id参数为空
            result.setBizCode(BizResultEnum.EMPTY.getBizCode());
            result.setMessage(BizResultEnum.EMPTY.getBizMessage());
            return result;
        }
        Requirement requirement = requirementService.getById(id);
        result.setResult(requirement);
        log.debug("返回值为:" + JSON.toJSONString(result.getResult()));
        return result;
    }


}
