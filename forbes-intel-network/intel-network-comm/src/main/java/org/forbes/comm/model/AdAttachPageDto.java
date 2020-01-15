package org.forbes.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/***
 * @创建人 niehy(Frunk)
 * @创建时间 2019/12/14
 * @修改人 (修改了该文件，请填上修改人的名字)
 * @修改日期 (请填上修改该文件时的日期)
 */
@ApiModel(description = "广告附件分页查询条件")
@Data
public class AdAttachPageDto implements Serializable{

    private static final long serialVersionUID = -2251046583622907406L;

    /**
     * 中文名称
     * Table:     f_ad_attach
     * Column:    cn_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "中文名称")
    private String cnName;

    /**
     * 广告位名称
     * Table:     f_ad_position
     * Column:    name
     * Nullable:  true
     */
    @ApiModelProperty(value = "广告位名称")
    private String name;

}
