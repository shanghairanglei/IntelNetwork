package org.forbes.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.forbes.IVocationTypeService;
import org.forbes.comm.vo.VocationTypeVo;
import org.forbes.dal.entity.VocationType;
import org.forbes.dal.mapper.VocationTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class VocationTypeImpl extends ServiceImpl<VocationTypeMapper, VocationType> implements IVocationTypeService {

    @Autowired
    VocationTypeMapper vocationTypeMapper;

    /***
     * getListName方法概述:获取所有行业类型名称
     * @return
     * @创建人 niehy(Frunk)
     * @创建时间 2020/1/16
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @Override
    public List<VocationTypeVo> getList() {
        return vocationTypeMapper.getList();
    }
}
