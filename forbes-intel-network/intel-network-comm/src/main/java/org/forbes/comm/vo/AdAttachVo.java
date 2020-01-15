package org.forbes.comm.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@ApiModel(description = "广告附件")
@EqualsAndHashCode(callSuper = false)
@Data
public class AdAttachVo implements Serializable{

    private static final long serialVersionUID = 5063556148703890279L;



    /**
     * 楼层ID
     * Table:     f_ad_position
     * Column:    floor_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "楼层ID", example = "0", required = true)
    private Long floorId;

    /**
     * 广告位名称
     * Table:     f_ad_position
     * Column:    name
     * Nullable:  true
     */
    @ApiModelProperty(value = "广告位名称", required = true)
    private String name;

    /**
     * 广告位数据类型
     * Table:     f_ad_position
     * Column:    data_type
     * Nullable:  true
     */
    @ApiModelProperty(value = "广告位数据类型")
    private String dataType;

    /**
     * 广告位数据编码
     * Table:     f_ad_position
     * Column:    data_code
     * Nullable:  true
     */
    @ApiModelProperty(value = "广告位数据编码")
    private String dataCode;

    /**
     * 排序
     * Table:     f_ad_attach
     * Column:    orders_sort
     * Nullable:  true
     */
    @ApiModelProperty(value = "排序",example = "0")
    private Integer ordersSort;

    /**
     * 后缀
     * Table:     f_ad_attach
     * Column:    suffix
     * Nullable:  true
     */
    @ApiModelProperty(value = "后缀")
    private String suffix;

    /**
     * 中文名称
     * Table:     f_ad_attach
     * Column:    cn_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "中文名称")
    private String cnName;

    /**英文名称
     * Table:     f_ad_attach
     * Column:    en_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "英文名称")
    private String enName;

    /**
     * 文件地址
     * Table:     f_ad_attach
     * Column:    file_path
     * Nullable:  true
     */
    @ApiModelProperty(value = "文件地址")
    private String filePath;


}
