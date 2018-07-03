package com.azi.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.azi.demo.service.api.DemoService;
import com.azi.demo.service.dao.TestMapper;
import com.azi.demo.service.dto.TestVO;
import com.azi.demo.service.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author azizwz@aliyun.com
 *         Function:
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private TestMapper testMapper;

    @Override
    @Transactional
    public void insertModel(String name) {
        Test test = new Test();
        test.setName(name);
        test.setTime(new Date());
        testMapper.insertTest(test);
    }

    @Override
    public List<TestVO> getTestByName(String name) {
        return testMapper.findByName(name);
    }

    @Override
    public TestVO getTestById(String id) {
        return testMapper.findByid(id);
    }
}
