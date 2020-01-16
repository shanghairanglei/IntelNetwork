package org.forbes.dal.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Administrator
 */
@Data
@ApiModel(description = "行业类型表")
@EqualsAndHashCode(callSuper = false)
@TableName("f_vocation_type")
public class VocationType extends BaseEntity {

    private static final long serialVersionUID = -8598239377210434806L;
    /**
     * 行业类型名称
     * Table:     f_vocation_type
     * Column:    vocation_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "行业类型名称", required = true)
    private String vocationName;

    /**
     * 排序
     * Table:     f_vocation_type
     * Column:    sort_no
     * Nullable:  true
     */
    @ApiModelProperty(value = "排序")
    private Integer sortNo;

}
