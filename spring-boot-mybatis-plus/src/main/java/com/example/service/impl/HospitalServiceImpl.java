package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.DO.HospitalDO;
import com.example.mapper.HospitalMapper;
import com.example.service.HospitalService;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl extends ServiceImpl<HospitalMapper, HospitalDO> implements HospitalService {

}
