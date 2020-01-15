package org.forbes.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/***
 * @创建人 niehy(Frunk)
 * @创建时间 2019/12/12
 * @修改人 (修改了该文件，请填上修改人的名字)
 * @修改日期 (请填上修改该文件时的日期)
 */
@ApiModel(description = "广告位分页查询条件")
@Data
public class AdPositionPageDto implements Serializable{
    private static final long serialVersionUID = -2429309148741898008L;

    @ApiModelProperty(value = "广告位名称")
    private String name;
}