package org.forbes.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/***
 * @创建人 niehy(Frunk)
 * @创建时间 2019/12/14
 * @修改人 (修改了该文件，请填上修改人的名字)
 * @修改日期 (请填上修改该文件时的日期)
 */
@ApiModel(description = "分页对象")
@Data
public class BasePageDto implements Serializable{


    private static final long serialVersionUID = -9047107906568360991L;

    /***当前页码
     */
    @ApiModelProperty(value="当前页码",example="1")
    @NotNull(message="当前页码为空")
    private Integer pageNo=1;
    /**每页显示记录数**/
    @ApiModelProperty(value="每页显示记录数",example="10")
    @NotNull(message="每页显示记录数为空")
    private Integer pageSize=10;
}
