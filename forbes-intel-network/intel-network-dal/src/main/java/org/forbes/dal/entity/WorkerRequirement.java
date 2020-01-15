package org.forbes.dal.entity;

import java.util.Date;
import lombok.Data;

/**
 * Table: f_worker_requirement
 */
@Data
public class WorkerRequirement extends BaseEntity {
    private static final long serialVersionUID = -817172619463424915L;
    /**
     * id
     * Table:     f_worker_requirement
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * 创建人
     * Table:     f_worker_requirement
     * Column:    create_by
     * Nullable:  true
     */
    private String createBy;

    /**
     * 创建时间
     * Table:     f_worker_requirement
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * 修改时间
     * Table:     f_worker_requirement
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    /**
     * 修改人
     * Table:     f_worker_requirement
     * Column:    update_by
     * Nullable:  true
     */
    private String updateBy;

    /**
     * 需求id
     * Table:     f_worker_requirement
     * Column:    require_id
     * Nullable:  true
     */
    private Long requireId;

    /**
     * 用户id（工作人员id）
     * Table:     f_worker_requirement
     * Column:    worker_id
     * Nullable:  true
     */
    private Long workerId;

    /**
     * 竞标状态(0未竞标1已竞标)
     * Table:     f_worker_requirement
     * Column:    state
     * Nullable:  true
     */
    private String state;
}