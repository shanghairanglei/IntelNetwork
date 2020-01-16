package org.forbes.workerRequirementController;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.forbes.IWorkerReqService;
import org.forbes.comm.constant.SaveValid;
import org.forbes.comm.enums.BiddingStateEnum;
import org.forbes.comm.enums.BizResultEnum;
import org.forbes.comm.utils.ConvertUtils;
import org.forbes.comm.vo.Result;
import org.forbes.dal.entity.WorkerRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务竞标管理
 *
 * @author Administrator
 */
@RequestMapping("/worker-requirement")
@Api(tags = {"任务竞标管理"})
@Slf4j
@RestController
public class WorkerRequirementController {

    @Autowired
    IWorkerReqService workerReqService;


    /***
     * selectPage方法慨述:添加竞标信息
     * @param workerRequirement
     * @return Result<SysPermission>
     * @创建人 frunk
     * @创建时间 2019年12月10日 下午1:48:45
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加竞标信息")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = Result.ADD_REQUIREMENT_ERROR_MSG),
            @ApiResponse(code = 200, message = Result.ADD_REQUIREMENT_MSG)
    })
    public Result<WorkerRequirement> add(@RequestBody @Validated(value = SaveValid.class) WorkerRequirement workerRequirement) {
        log.debug("传入参数为：" + JSON.toJSONString(workerRequirement));
        Result<WorkerRequirement> result = new Result<WorkerRequirement>();
        if (ConvertUtils.isEmpty(workerRequirement)) {
            //竞标对象为空
            result.setBizCode(BizResultEnum.ENTITY_EMPTY.getBizCode());
            result.setMessage(BizResultEnum.ENTITY_EMPTY.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(workerRequirement.getRequireId())) {
            //需求任务id为空
            result.setBizCode(BizResultEnum.REQUIRE_ID.getBizCode());
            result.setMessage(BizResultEnum.REQUIRE_ID.getBizMessage());
            return result;
        }
        if (ConvertUtils.isEmpty(workerRequirement.getWorkerId())) {
            //需求任务id为空
            result.setBizCode(BizResultEnum.WORKER_ID.getBizCode());
            result.setMessage(BizResultEnum.WORKER_ID.getBizMessage());
            return result;
        }
        //默认竞标后为等待审批状态
        workerRequirement.setState(BiddingStateEnum.WAITING_FOR_APPROVAL.getCode());
        workerReqService.save(workerRequirement);
        result.setResult(workerRequirement);
        log.debug("返回值为:" + JSON.toJSONString(result.getResult()));
        return result;
    }
}
