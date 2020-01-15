package org.forbes.dal.entity;

import java.util.Date;
import lombok.Data;

/**
 * Table: f_user_requirement
 */
@Data
public class UserRequirement extends BaseEntity {
    /**
     * id
     * Table:     f_user_requirement
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * 创建人
     * Table:     f_user_requirement
     * Column:    create_by
     * Nullable:  true
     */
    private String createBy;

    /**
     * 创建时间
     * Table:     f_user_requirement
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * 修改时间
     * Table:     f_user_requirement
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    /**
     * 修改人
     * Table:     f_user_requirement
     * Column:    update_by
     * Nullable:  true
     */
    private String updateBy;

    /**
     * 需求id
     * Table:     f_user_requirement
     * Column:    require_id
     * Nullable:  true
     */
    private Long requireId;

    /**
     * 用户id（发布需求人）
     * Table:     f_user_requirement
     * Column:    user_id
     * Nullable:  true
     */
    private Long userId;
}