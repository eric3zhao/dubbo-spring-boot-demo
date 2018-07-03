package com.azi.demo.service.api;

import com.azi.demo.service.dto.TestVO;

import java.util.List;

/**
 * @author azizwz@aliyun.com
 * Function: api定义
 */
public interface DemoService {

    void insertModel(String name);

    List<TestVO> getTestByName(String name);

    TestVO getTestById(String id);
}
