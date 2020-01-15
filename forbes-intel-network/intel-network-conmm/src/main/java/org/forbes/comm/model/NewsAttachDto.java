package org.forbes.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/***
 * 概述:新闻附件分页查询条件
 * @创建人 niehy(Frunk)
 * @创建时间 2019/12/16
 * @修改人 (修改了该文件，请填上修改人的名字)
 * @修改日期 (请填上修改该文件时的日期)
 */
@Data
@ApiModel(description = "新闻附件分页查询条件")
public class NewsAttachDto implements Serializable{

    private static final long serialVersionUID = -4326567164935362070L;

    /**
     * 数据ID
     * Table:     f_news_attach
     * Column:    data_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "数据ID(新闻ID)",example = "0")
    private Long dataId;

    /**
     * 后缀
     * Table:     f_news_attach
     * Column:    suffix
     * Nullable:  true
     */
    @ApiModelProperty(value = "文件后缀")
    private String suffix;

    /**
     * 中文名称
     * Table:     f_news_attach
     * Column:    cn_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "附件中文名称")
    private String cnName;

    /**
     * 数据类型,0-展示缩略图,1-新闻附件
     * Table:     f_news_attach
     * Column:    data_type
     * Nullable:  true
     */
    @ApiModelProperty(value = "数据类型,0-展示缩略图,1-新闻附件")
    private String dataType;

}
