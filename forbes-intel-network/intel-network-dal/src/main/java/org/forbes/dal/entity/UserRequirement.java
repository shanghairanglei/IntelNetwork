package org.forbes.dal.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: f_user_requirement
 * @author Administrator
 */
@Data
@ApiModel(description="用户需求中间表")
@EqualsAndHashCode(callSuper = false)
@TableName("f_user_requirement")
public class UserRequirement extends BaseEntity {
    private static final long serialVersionUID = -6855925341392769155L;

    /**
     * 需求id
     * Table:     f_user_requirement
     * Column:    require_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "需求id",example = "0")
    private Long requireId;

    /**
     * 用户id（发布需求人）
     * Table:     f_user_requirement
     * Column:    user_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "用户id（发布需求人）",example = "0")
    private Long userId;
}