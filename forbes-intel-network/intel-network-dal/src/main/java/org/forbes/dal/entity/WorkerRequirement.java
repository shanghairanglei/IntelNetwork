package org.forbes.dal.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: f_worker_requirement
 * @author Administrator
 */
@Data
@ApiModel(description="需求任务中间表")
@EqualsAndHashCode(callSuper = false)
@TableName("f_worker_requirement")
public class WorkerRequirement extends BaseEntity {
    private static final long serialVersionUID = -817172619463424915L;

    /**
     * 需求id
     * Table:     f_worker_requirement
     * Column:    require_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "需求任务id",example = "0",required = true)
    private Long requireId;

    /**
     * 用户id（竞标人员id）
     * Table:     f_worker_requirement
     * Column:    worker_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "用户id（竞标人员id）",example = "0",required = true)
    private Long workerId;

    /**
     * 竞标状态(0等待审批1竞标成功2竞标失败)
     * Table:     f_worker_requirement
     * Column:    state
     * Nullable:  true
     */
    @ApiModelProperty(value = "竞标状态(0等待审批1竞标成功2竞标失败)")
    private String state;
}