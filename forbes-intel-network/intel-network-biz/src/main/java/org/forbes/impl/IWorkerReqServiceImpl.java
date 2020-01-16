package org.forbes.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.forbes.IWorkerReqService;
import org.forbes.dal.entity.WorkerRequirement;
import org.forbes.dal.mapper.WorkerReqMapper;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class IWorkerReqServiceImpl extends ServiceImpl<WorkerReqMapper,WorkerRequirement> implements IWorkerReqService {
}
