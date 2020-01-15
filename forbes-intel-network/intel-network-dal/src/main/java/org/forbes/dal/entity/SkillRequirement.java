package org.forbes.dal.entity;

import java.util.Date;
import lombok.Data;

/**
 * Table: f_skill_requirement
 */
@Data
public class SkillRequirement extends BaseEntity {
    /**
     * id
     * Table:     f_skill_requirement
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * 创建人
     * Table:     f_skill_requirement
     * Column:    create_by
     * Nullable:  true
     */
    private String createBy;

    /**
     * 创建时间
     * Table:     f_skill_requirement
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * 修改人
     * Table:     f_skill_requirement
     * Column:    update_by
     * Nullable:  true
     */
    private String updateBy;

    /**
     * 修改时间
     * Table:     f_skill_requirement
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    /**
     * 技能id
     * Table:     f_skill_requirement
     * Column:    skill_id
     * Nullable:  true
     */
    private Long skillId;

    /**
     * 用户id
     * Table:     f_skill_requirement
     * Column:    user_id
     * Nullable:  true
     */
    private Long userId;
}