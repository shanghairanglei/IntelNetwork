package org.forbes.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Administrator
 */
@Data
@ApiModel("需求分页传入值")
public class RequirementPageDto implements Serializable {

    private static final long serialVersionUID = 2618492859007097028L;

    /**
     * 需求名称
     * Table:     f_requirement
     * Column:    r_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "需求名称")
    private String name;

    /**
     * 最低薪水
     * Table:     f_requirement
     * Column:    min_salary
     * Nullable:  true
     */
    @ApiModelProperty(value = "最低薪水",example = "0")
    private BigDecimal minSalary;

    /**
     * 最高薪水
     * Table:     f_requirement
     * Column:    max_salary
     * Nullable:  true
     */
    @ApiModelProperty(value = "最高薪水",example = "0")
    private BigDecimal maxSalary;

    /**
     * 行业类型
     * Table:     f_requirement
     * Column:    vocation_type
     * Nullable:  true
     */
    @ApiModelProperty(value = "行业类型")
    private String vocationType;

    /**
     * 任务类型
     * Table:     f_requirement
     * Column:    task_type
     * Nullable:  true
     */
    @ApiModelProperty(value = "任务类型")
    private String taskType;
}
