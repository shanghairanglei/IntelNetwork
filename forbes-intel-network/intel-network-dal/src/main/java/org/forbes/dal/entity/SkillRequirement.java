package org.forbes.dal.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: f_skill_requirement
 * @author Administrator
 */
@Data
@ApiModel(description="技能需求中间表")
@EqualsAndHashCode(callSuper = false)
@TableName("f_skill_requirement")
public class SkillRequirement extends BaseEntity {
    private static final long serialVersionUID = 4389633361054873562L;


    /**
     * 技能id
     * Table:     f_skill_requirement
     * Column:    skill_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "技能id",example = "0")
    private Long skillId;

    /**
     * 用户id
     * Table:     f_skill_requirement
     * Column:    user_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "用户id",example = "0")
    private Long userId;
}