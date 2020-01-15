package org.forbes.dal.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Table: f_requirement
 */
@Data
public class Requirement extends BaseEntity {
    /**
     * id
     * Table:     f_requirement
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * 需求名称
     * Table:     f_requirement
     * Column:    r_name
     * Nullable:  true
     */
    private String rName;

    /**
     * 需求创建时间
     * Table:     f_requirement
     * Column:    createtime
     * Nullable:  true
     */
    private Date createtime;

    /**
     * 需求修改时间
     * Table:     f_requirement
     * Column:    updatetime
     * Nullable:  true
     */
    private Date updatetime;

    /**
     * 最低薪水
     * Table:     f_requirement
     * Column:    min_salary
     * Nullable:  true
     */
    private BigDecimal minSalary;

    /**
     * 最高薪水
     * Table:     f_requirement
     * Column:    max_salary
     * Nullable:  true
     */
    private BigDecimal maxSalary;

    /**
     * 行业类型
     * Table:     f_requirement
     * Column:    vocation_type
     * Nullable:  true
     */
    private String vocationType;

    /**
     * 任务类型
     * Table:     f_requirement
     * Column:    task_type
     * Nullable:  true
     */
    private String taskType;

    /**
     * 项目周期（xx个月）
     * Table:     f_requirement
     * Column:    cycle_time
     * Nullable:  true
     */
    private Integer cycleTime;

    /**
     * 项目要求,描述
     * Table:     f_requirement
     * Column:    description
     * Nullable:  true
     */
    private String description;

    /**
     * 审核状态（0未通过1通过(初期默认通过)2待审核）
     * Table:     f_requirement
     * Column:    check_state
     * Nullable:  true
     */
    private String checkState;

    /**
     * 是否议价（0不可议价1可议价）
     * Table:     f_requirement
     * Column:    is_premium
     * Nullable:  true
     */
    private String isPremium;

    /**
     * 竞标人数
     * Table:     f_requirement
     * Column:    amount
     * Nullable:  true
     */
    private Integer amount;

    /**
     * 是否外派
     * Table:     f_requirement
     * Column:    is_assignment
     * Nullable:  true
     */
    private String isAssignment;

    /**
     * 创建人
     * Table:     f_requirement
     * Column:    create_by
     * Nullable:  true
     */
    private String createBy;

    /**
     * 创建时间
     * Table:     f_requirement
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * 修改时间
     * Table:     f_requirement
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    /**
     * 修改人
     * Table:     f_requirement
     * Column:    update_by
     * Nullable:  true
     */
    private String updateBy;
}