package org.forbes.comm.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * Table: f_sys_role
 */
@Data
public class SysRole implements Serializable {
    
	
	private static final long serialVersionUID = -1667826254533837671L;

    /**
     * 角色名称
     * Table:     f_sys_role
     * Column:    role_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "角色名称",required = true)
    @NotEmpty(message="角色名称为空")
    private String roleName;

    /**
     * 角色编码
     * Table:     f_sys_role
     * Column:    role_code
     * Nullable:  true
     */
    @ApiModelProperty(value = "角色编码",required = true)
    @NotEmpty(message="角色编码为空")
    private String roleCode;

    /**
     * 角色描述
     * Table:     f_sys_role
     * Column:    description
     * Nullable:  true
     */
    @ApiModelProperty(value = "角色描述")
    private String description;
}