package org.forbes.dal.entity;

import java.util.Date;
import lombok.Data;

/**
 * Table: f_skill
 */
@Data
public class Skill extends BaseEntity {
    /**
     * id
     * Table:     f_skill
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * 创建人
     * Table:     f_skill
     * Column:    create_by
     * Nullable:  true
     */
    private String createBy;

    /**
     * 创建时间
     * Table:     f_skill
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * 修改时间
     * Table:     f_skill
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    /**
     * 修改人
     * Table:     f_skill
     * Column:    update_by
     * Nullable:  true
     */
    private String updateBy;

    /**
     * 技能名称
     * Table:     f_skill
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * 排序
     * Table:     f_skill
     * Column:    sort
     * Nullable:  true
     */
    private Integer sort;

    /**
     * 描述
     * Table:     f_skill
     * Column:    description
     * Nullable:  true
     */
    private String description;
}