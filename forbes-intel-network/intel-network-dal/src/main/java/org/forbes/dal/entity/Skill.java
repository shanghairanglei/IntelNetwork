package org.forbes.dal.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: f_skill
 * @author Administrator
 */
@Data
@ApiModel(description="技能实体类")
@EqualsAndHashCode(callSuper = false)
@TableName("f_skill")
public class Skill extends BaseEntity {
    private static final long serialVersionUID = -3889712948410672856L;

    /**
     * 技能名称
     * Table:     f_skill
     * Column:    name
     * Nullable:  true
     */
    @ApiModelProperty(value = "技能名称")
    private String name;

    /**
     * 排序
     * Table:     f_skill
     * Column:    sort
     * Nullable:  true
     */
    @ApiModelProperty(value = "排序",example = "0")
    private Integer sort;

    /**
     * 描述
     * Table:     f_skill
     * Column:    description
     * Nullable:  true
     */
    @ApiModelProperty(value = "描述")
    private String description;
}