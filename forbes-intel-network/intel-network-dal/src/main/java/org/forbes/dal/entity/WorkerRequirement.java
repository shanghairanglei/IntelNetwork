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
@ApiModel(description="权限信息")
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
    @ApiModelProperty(value = "需求id",example = "0")
    private Long requireId;

    /**
     * 用户id（工作人员id）
     * Table:     f_worker_requirement
     * Column:    worker_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "用户id（工作人员id）",example = "0")
    private Long workerId;

    /**
     * 竞标状态(0未竞标1已竞标)
     * Table:     f_worker_requirement
     * Column:    state
     * Nullable:  true
     */
    @ApiModelProperty(value = "竞标状态(0未竞标1已竞标)")
    private String state;
}