package org.forbes.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * 登录表单
 *
 * @author scott
 * @since  2019-01-18
 */
@ApiModel(description="登录表单")
public class SysLoginModel {
	@ApiModelProperty(value="登录账号",required=true)
	@NotEmpty(message="登录账号不能为空")
    private String username;
	@ApiModelProperty(value="登录密码",required=true)
	@NotEmpty(message="登录密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}