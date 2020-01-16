package org.forbes.dal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.forbes.comm.vo.VocationTypeVo;
import org.forbes.dal.entity.VocationType;

import java.util.List;

/**
 * @author Administrator
 */
public interface VocationTypeMapper extends BaseMapper<VocationType> {

    /***
     * getListName方法概述:获取所有行业类型名称=
     * @return
     * @创建人 niehy(Frunk)
     * @创建时间 2020/1/16
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    List<VocationTypeVo> getList();

}