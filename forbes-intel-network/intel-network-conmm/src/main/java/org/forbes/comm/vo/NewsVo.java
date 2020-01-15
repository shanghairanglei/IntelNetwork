package org.forbes.comm.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.forbes.comm.constant.UpdateValid;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@ApiModel(description = "新闻对象")
@EqualsAndHashCode(callSuper = false)
@Data
public class NewsVo implements Serializable{

    private static final long serialVersionUID = 3951322942699194792L;

    /**
     * 主键
     * Table:     f_ad_position
     * Column:    id
     * Nullable:  false
     */
    @TableId(type = IdType.AUTO)
    @JSONField(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "主键id",example = "0")
    @NotNull(message="主键ID为空",groups=UpdateValid.class)
    private Long id;

    /**
     * 标题
     * Table:     f_news
     * Column:    title
     * Nullable:  true
     */
    @ApiModelProperty(value = "标题",required = true)
    @NotEmpty(message = "新闻标题为空")
    private String title;

    /**
     * 发布状态,-1未发布，0审核
     * Table:     f_news
     * Column:    release_status
     * Nullable:  true
     */
    @ApiModelProperty(value = "发布状态,0审核,-1未发布")
    private String releaseStatus;

    /**
     * 新闻内容
     * Table:     f_news
     * Column:    content
     * Nullable:  true
     */
    @ApiModelProperty(value = "新闻内容",required = true)
    @NotEmpty(message = "新闻内容为空")
    private String content;

    /**
     * 发布时间
     * Table:     f_news
     * Column:    release_time
     * Nullable:  true
     */
    @ApiModelProperty(value = "发布时间")
    private Date releaseTime;

    /**
     * 新闻类型ID
     * Table:     f_news
     * Column:    type_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "新闻类型ID",required = true)
    private String typeId;

    /**
     * 新闻分类名称(中文)
     * Table:     f_news_type
     * Column:    cn_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "新闻分类名称(中文)",required = true)
    private String cnName;

    /**
     * 新闻分类编码
     * Table:     f_news_type
     * Column:    code
     * Nullable:  true
     */
    @ApiModelProperty(value = "新闻分类编码")
    private String code;

}
