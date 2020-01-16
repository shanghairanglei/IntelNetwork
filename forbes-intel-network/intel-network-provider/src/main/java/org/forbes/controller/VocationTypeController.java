package org.forbes.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.forbes.IVocationTypeService;
import org.forbes.comm.constant.SaveValid;
import org.forbes.comm.enums.BiddingStateEnum;
import org.forbes.comm.enums.BizResultEnum;
import org.forbes.comm.utils.ConvertUtils;
import org.forbes.comm.vo.Result;
import org.forbes.comm.vo.VocationTypeVo;
import org.forbes.dal.entity.WorkerRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RequestMapping("/vocation-type")
@Api(tags = {"行业分类管理"})
@Slf4j
@RestController
public class VocationTypeController {

    @Autowired
    IVocationTypeService vocationTypeService;


    /***
     * selectAll方法慨述:
     * @return Result<SysPermission>
     * @创建人 frunk
     * @创建时间 2019年12月10日 下午1:48:45
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    @ApiOperation(value = "获取所有行业类别信息")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = Result.VOCATION_TYPE_ERROR_MSG),
            @ApiResponse(code = 200, message = Result.VOCATION_TYPE_MSG)
    })
    public Result<List<VocationTypeVo>> selectAll() {
        Result<List<VocationTypeVo>> result = new Result<List<VocationTypeVo>>();
        List<VocationTypeVo> list = vocationTypeService.getList();
        result.setResult(list);
        return result;
    }

}
