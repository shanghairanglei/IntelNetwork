package org.forbes.comm.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.forbes.comm.constant.UpdateValid;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Administrator
 */
@Data
@ApiModel(description = "行业类别返回视图")
@EqualsAndHashCode(callSuper = false)
public class VocationTypeVo implements Serializable {
    private static final long serialVersionUID = -5190869179281876205L;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    @NotNull(message = "主键ID为空", groups = UpdateValid.class)
    private Long id;

    /**
     * 行业类型名称
     * Table:     f_vocation_type
     * Column:    vocation_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "行业类型名称", required = true)
    private String vocationName;
}
