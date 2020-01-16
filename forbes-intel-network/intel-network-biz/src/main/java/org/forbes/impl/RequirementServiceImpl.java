package org.forbes.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.forbes.IRequirementService;
import org.forbes.dal.entity.Requirement;
import org.forbes.dal.mapper.RequirementMapper;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class RequirementServiceImpl extends ServiceImpl<RequirementMapper,Requirement> implements IRequirementService {
}
