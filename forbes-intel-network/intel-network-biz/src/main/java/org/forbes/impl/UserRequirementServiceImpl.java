package org.forbes.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.forbes.IUserRequirementService;
import org.forbes.dal.entity.UserRequirement;
import org.forbes.dal.mapper.UserRequirementMapper;
import org.springframework.stereotype.Service;

@Service
public class UserRequirementServiceImpl extends ServiceImpl<UserRequirementMapper,UserRequirement> implements IUserRequirementService{
}
