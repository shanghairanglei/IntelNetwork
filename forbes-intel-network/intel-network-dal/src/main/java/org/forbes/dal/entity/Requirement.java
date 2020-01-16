package org.forbes.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: f_requirement
 *
 * @author Administrator
 */
@Data
@ApiModel(description = "需求任务实体类")
@EqualsAndHashCode(callSuper = false)
@TableName("f_requirement")
public class Requirement extends BaseEntity {

    private static final long serialVersionUID = -1113065399582467964L;

    /**
     * 需求名称
     * Table:     f_requirement
     * Column:    r_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "需求名称",required = true)
    private String name;

    /**
     * 最低薪水
     * Table:     f_requirement
     * Column:    min_salary
     * Nullable:  true
     */
    @ApiModelProperty(value = "最低薪水", example = "0",required = true)
    private BigDecimal minSalary;

    /**
     * 最高薪水
     * Table:     f_requirement
     * Column:    max_salary
     * Nullable:  true
     */
    @ApiModelProperty(value = "最高薪水", example = "0",required = true)
    private BigDecimal maxSalary;

    /**
     * 行业类型
     * Table:     f_requirement
     * Column:    vocation_type
     * Nullable:  true
     */
    @ApiModelProperty(value = "行业类型",required = true)
    private String vocationType;

    /**
     * 任务类型(0佣金任务1周期任务2包月任务)
     * Table:     f_requirement
     * Column:    task_type
     * Nullable:  true
     */
    @ApiModelProperty(value = "任务类型(0佣金任务1周期任务2包月任务)",required = true)
    private String taskType;

    /**
     * 项目周期（xx个月）
     * Table:     f_requirement
     * Column:    cycle_time
     * Nullable:  true
     */
    @ApiModelProperty(value = "项目周期（xx个月）", example = "0",required = true)
    private Integer cycleTime;

    /**
     * 项目要求,描述
     * Table:     f_requirement
     * Column:    description
     * Nullable:  true
     */
    @ApiModelProperty(value = "项目要求,描述",required = true)
    private String description;

    /**
     * 审核状态（0未通过1通过2待审核）
     * Table:     f_requirement
     * Column:    check_state
     * Nullable:  true
     */
    @ApiModelProperty(value = "审核状态（0未通过1通过2待审核）,前端不传值")
    private String checkState;

    /**
     * 是否议价（0否1是）
     * Table:     f_requirement
     * Column:    is_premium
     * Nullable:  true
     */
    @ApiModelProperty(value = "是否议价（0否1是）")
    private String isPremium;

    /**
     * 竞标人数
     * Table:     f_requirement
     * Column:    amount
     * Nullable:  true
     */
    @ApiModelProperty(value = "竞标人数", example = "0")
    private Integer amount;

    /**
     * 是否主场
     * Table:     f_requirement
     * Column:    is_assignment
     * Nullable:  true
     */
    @ApiModelProperty(value = "是否主场,0否1是")
    private String isAssignment;

    /**
     * 任务图标
     * Table:     f_requirement
     * Column:    icon
     * Nullable:  true
     */
    @ApiModelProperty(value = "任务图标")
    private String icon;

    /**
     * 服务方(0:不限制,1:个人,2:团队)
     * Table:     f_requirement
     * Column:    party_B
     * Nullable:  true
     */
    @ApiModelProperty(value = "服务方(0:不限制,1:个人,2:团队)",required = true)
    private String partyB;

    /**
     * 需求所属用户的id
     * Table:     f_requirement
     * Column:    user_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "需求所属用户的id",required = true)
    private Long userId;


}