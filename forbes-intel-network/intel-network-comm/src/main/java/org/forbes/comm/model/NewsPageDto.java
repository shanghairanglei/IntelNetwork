package org.forbes.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(description = "新闻分页查询条件")
public class NewsPageDto implements Serializable{

    private static final long serialVersionUID = 7565173002963736425L;

    /**
     * 标题
     * Table:     f_news
     * Column:    title
     * Nullable:  true
     */
    @ApiModelProperty(value = "新闻标题")
    private String title;

    /**
     * 发布状态,-1未发布，0审核
     * Table:     f_news
     * Column:    release_status
     * Nullable:  true
     */
    @ApiModelProperty(value = "新闻发布状态,0审核,1未发布,2已发布")
    private String releaseStatus;

    /**
     * 新闻分类ID
     * Table:     f_news
     * Column:    name
     * Nullable:  true
     */
    @ApiModelProperty(value = "新闻分类ID",example = "0")
    private Long typeId;
}
